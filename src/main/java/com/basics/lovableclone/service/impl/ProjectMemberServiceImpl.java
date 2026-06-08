package com.basics.lovableclone.service.impl;

import com.basics.lovableclone.dtos.member.InviteMemberRequest;
import com.basics.lovableclone.dtos.member.MemberResponse;
import com.basics.lovableclone.entity.ProjectMember;
import com.basics.lovableclone.service.ProjectMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectMemberServiceImpl implements ProjectMemberService {
    @Override
    public List<ProjectMember> getProjectMembers(Long projectId, Long userId) {
        return List.of();
    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
