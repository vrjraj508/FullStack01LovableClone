package com.basics.lovableclone.dtos.project;

import com.basics.lovableclone.dtos.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
