package com.basics.lovableclone.service.impl;

import com.basics.lovableclone.dtos.project.ProjectRequest;
import com.basics.lovableclone.dtos.project.ProjectResponse;
import com.basics.lovableclone.dtos.project.ProjectSummaryResponse;
import com.basics.lovableclone.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<ProjectSummaryResponse> getUserProjects(Long userId) {
        return List.of();
    }

    @Override
    public ProjectResponse getUserProjectById(Long id, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse createProject(ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public ProjectResponse updateProject(Long id, ProjectRequest request, Long userId) {
        return null;
    }

    @Override
    public void softDelete(Long id, Long userId) {

    }
}
