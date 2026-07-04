package com.basics.lovableclone.dtos.project;

import com.basics.lovableclone.entity.User;

public record ProjectRequest(
        String name,
        User owner
) {
}
