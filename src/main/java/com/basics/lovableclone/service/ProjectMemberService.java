package com.basics.lovableclone.service;

import com.basics.lovableclone.dtos.member.InviteMemberRequest;
import com.basics.lovableclone.dtos.member.MemberResponse;
import com.basics.lovableclone.entity.ProjectMember;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    MemberResponse deleteMember(Long projectId, Long memberId, Long userId);
}
