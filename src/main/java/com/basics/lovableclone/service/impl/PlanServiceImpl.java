package com.basics.lovableclone.service.impl;

import com.basics.lovableclone.dtos.subscription.PlanResponse;
import com.basics.lovableclone.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlanServiceImpl implements PlanService {
    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
