package com.basics.lovableclone.dtos.subscription;

public record PlanLimitResponse(
        String planName,
        int maxTokensPerDay,
        int maxProjects,
        boolean unlimitedAi
) {

}
