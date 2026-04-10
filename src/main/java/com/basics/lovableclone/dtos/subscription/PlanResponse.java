package com.basics.lovableclone.dtos.subscription;

public record PlanResponse (
        Long id,
        String name,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Boolean unlimitedAi,
        String price
){
}
