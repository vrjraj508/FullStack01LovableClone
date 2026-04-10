package com.basics.lovableclone.dtos.member;

import com.basics.lovableclone.entity.enums.ProjectRole;

import java.time.Instant;

public record MemberResponse(
        Long id,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
