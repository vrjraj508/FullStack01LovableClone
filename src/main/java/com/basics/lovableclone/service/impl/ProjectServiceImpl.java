package com.basics.lovableclone.service.impl;

import com.basics.lovableclone.dtos.project.ProjectRequest;
import com.basics.lovableclone.dtos.project.ProjectResponse;
import com.basics.lovableclone.dtos.project.ProjectSummaryResponse;
import com.basics.lovableclone.entity.Project;
import com.basics.lovableclone.entity.User;
import com.basics.lovableclone.mapper.ProjectMapper;
import com.basics.lovableclone.repository.ProjectRepository;
import com.basics.lovableclone.repository.UserRepository;
import com.basics.lovableclone.service.ProjectService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;
    private final ProjectMapper projectMapper;

    public ProjectServiceImpl(ProjectRepository projectRepository, UserRepository userRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.userRepository = userRepository;
        this.projectMapper = projectMapper;
    }

    //Here we are not going to use model mapper as it uses reflection and is slower
    //Also we cannot use model mapper with nested records as the support for model mapper records was added recently and is not very stable
    //We can implement nested records in the provided programs


    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {

        User owner = userRepository.findById(userId).orElseThrow(()-> new RuntimeException(("User not found")));

        Project project = Project.builder()
                .name( request.name())
                .owner(owner)
                .isPublic(false)
                .build();

        project = projectRepository.save(project);

        return projectMapper.toProjectResponse(project);
    }

    //Here we can use the mapper and the stream to convert it in project response and get the details here.

    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {

        return projectRepository.findAllAccessibleByUser(userId)
                .stream()
                .map(projectMapper::toProjectSummaryResponse)
                .collect(Collectors.toList());
    }



    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }



    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }


    //Testing methods Here
    public List<ProjectResponse> getAllProjects(){
        List<ProjectResponse> allProjects = projectRepository.findAll()
                .stream()
                .map(projectMapper::toProjectResponse)
                .toList();

        return allProjects;
    }
}
