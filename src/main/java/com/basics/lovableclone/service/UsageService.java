package com.basics.lovableclone.service;

import com.basics.lovableclone.dtos.subscription.PlanLimitResponse;
import com.basics.lovableclone.dtos.subscription.UsageTodayResponse;
import org.springframework.stereotype.Service;


public interface UsageService {
    UsageTodayResponse getTodayUsage(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
