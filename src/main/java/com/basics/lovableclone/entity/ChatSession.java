package com.basics.lovableclone.entity;

import java.time.Instant;

public class ChatSession {

    Project project;
    User user;
    String title;

    Instant createdAt;
    Instant updatedAt;


    Instant deletedAt;//Soft delete

}

//We can have 1 project and 1 chat sessions for each project
//later on multiple users can come and all users can have chat session on their own to discuss the project.
