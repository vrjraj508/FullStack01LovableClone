package com.basics.lovableclone.controller;

import com.basics.lovableclone.dtos.project.ProjectRequest;
import com.basics.lovableclone.dtos.project.ProjectResponse;
import com.basics.lovableclone.dtos.project.ProjectSummaryResponse;
import com.basics.lovableclone.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {

    private final ProjectService projectService;

    //Can be accessed by those who are already logged in the app
    @GetMapping
    public ResponseEntity<List<ProjectSummaryResponse>> getMyProjects(){
        Long userId = 1L; //Todo update later from spring security
        //Dummy object to make the project from start.

        return ResponseEntity.ok(projectService.getUserProjects(userId));
    }


    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponse> getProjectById(@PathVariable Long id){
        Long userId = 1L;

        return ResponseEntity.ok(projectService.getUserProjectById(id, userId));
    }

    @PostMapping
    public ResponseEntity<ProjectResponse> createProject(@RequestBody ProjectRequest request){
        Long userId = 1L;

        return ResponseEntity.status(HttpStatus.CREATED).body(projectService.createProject(request,userId));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<ProjectResponse> updateProject(@PathVariable Long id, @RequestBody ProjectRequest request){
        Long userId = 1L;
        return ResponseEntity.ok(projectService.updateProject(id,request,userId));
    }


}
