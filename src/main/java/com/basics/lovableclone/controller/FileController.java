package com.basics.lovableclone.controller;


import com.basics.lovableclone.dtos.project.FileContentResponse;
import com.basics.lovableclone.dtos.project.FileNode;
import com.basics.lovableclone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileTree(projectId));
    }

    //Get all the things after the / or //
    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFile(
            @PathVariable Long projectId,
            @PathVariable String path
    ){
        Long userid = 1L;
        return ResponseEntity.ok(fileService.getFileContent(projectId,path,userid));
    }
}
