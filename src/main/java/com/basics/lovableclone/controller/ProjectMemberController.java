package com.basics.lovableclone.controller;

import com.basics.lovableclone.dtos.member.InviteMemberRequest;
import com.basics.lovableclone.dtos.member.MemberResponse;
import com.basics.lovableclone.entity.ProjectMember;
import com.basics.lovableclone.service.ProjectMemberService;
import com.basics.lovableclone.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects/{projectId}/members")
@RequiredArgsConstructor
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;


    @GetMapping
    public ResponseEntity<List<ProjectMember>> getProjectMembers(@PathVariable Long projectId ){
        Long userId = 1L;

        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId, userId));
    }

    //In the request we should pass as the request body

    @PostMapping
    public ResponseEntity<MemberResponse> inviteMember(
            @PathVariable Long projectId,
            @RequestBody InviteMemberRequest request
    ){
        Long userId = 1L;
        return ResponseEntity.status(HttpStatus.CREATED).body(projectMemberService.inviteMember(projectId,request,userId));


    }

    @PatchMapping("/{memberId}")
    public ResponseEntity<MemberResponse> updateMemberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody InviteMemberRequest request
    ){
        Long userId = 1L;

        return ResponseEntity.ok(projectMemberService.updateMemberRole(projectId,memberId,request,userId));
    }


    @DeleteMapping("/{memberId}")
    public ResponseEntity<MemberResponse> deleteProjectMember(
            @PathVariable Long projectId,
            @PathVariable Long memberId
    ){
        Long userId = 1L;

        return ResponseEntity.ok(projectMemberService.deleteMember(projectId,memberId,userId));
    }
}
