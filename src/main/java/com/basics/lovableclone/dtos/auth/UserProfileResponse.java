package com.basics.lovableclone.dtos.auth;

public record UserProfileResponse(
        Long id,
        String email,
        String name,
        String avatarUrl
) {
}
