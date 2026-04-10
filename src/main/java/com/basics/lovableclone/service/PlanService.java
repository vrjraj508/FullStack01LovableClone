package com.basics.lovableclone.service;

import com.basics.lovableclone.dtos.subscription.PlanResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PlanService {
    List<PlanResponse> getAllActivePlans();
}
