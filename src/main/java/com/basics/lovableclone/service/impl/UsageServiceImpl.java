package com.basics.lovableclone.service.impl;

import com.basics.lovableclone.dtos.subscription.PlanLimitResponse;
import com.basics.lovableclone.dtos.subscription.UsageTodayResponse;
import com.basics.lovableclone.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {
    @Override
    public UsageTodayResponse getTodayUsage(Long userId) {
        return null;
    }

    @Override
    public PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
