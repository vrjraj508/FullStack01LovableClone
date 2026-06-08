package com.basics.lovableclone.service.impl;

import com.basics.lovableclone.dtos.project.FileContentResponse;
import com.basics.lovableclone.dtos.project.FileNode;
import com.basics.lovableclone.service.FileService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public List<FileNode> getFileTree(Long projectId) {
        return List.of();
    }

    @Override
    public FileContentResponse getFileContent(Long projectId, String path, Long userid) {
        return null;
    }
}
