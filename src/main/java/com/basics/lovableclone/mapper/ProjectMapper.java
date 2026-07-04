package com.basics.lovableclone.mapper;

import com.basics.lovableclone.dtos.project.ProjectResponse;
import com.basics.lovableclone.entity.Project;
import org.mapstruct.Mapper;


//Works regardless of the project
@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toProjectResponse(Project project);
}
