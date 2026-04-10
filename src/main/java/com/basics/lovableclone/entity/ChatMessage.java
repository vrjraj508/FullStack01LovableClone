package com.basics.lovableclone.entity;

import java.time.Instant;

public class ChatMessage {
    Long id;
    ChatSession chatSession;

    String content;
    String toolCalls; //JSON Array of tools called

    Integer tokensUsed;

    Instant createdAt;


}
