package com.basics.lovableclone.mapper;

import com.basics.lovableclone.dtos.project.ProjectResponse;
import com.basics.lovableclone.dtos.project.ProjectSummaryResponse;
import com.basics.lovableclone.entity.Project;
import org.mapstruct.Mapper;

import java.util.List;


//Works regardless of the project
@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);

    ProjectSummaryResponse toProjectSummaryResponse(Project project);

    List<ProjectSummaryResponse> toListOfProjectSummaryResponse(List<Project> projects);
}
