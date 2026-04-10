package com.basics.lovableclone.dtos.member;

import com.basics.lovableclone.entity.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
