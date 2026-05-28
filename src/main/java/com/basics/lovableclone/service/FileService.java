package com.basics.lovableclone.service;

import com.basics.lovableclone.dtos.project.FileContentResponse;
import com.basics.lovableclone.dtos.project.FileNode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FileService {
    List<FileNode> getFileTree(Long projectId);

    FileContentResponse getFileContent(Long projectId, String path, Long userid);
}
