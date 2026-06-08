package com.basics.lovableclone.service.impl;

import com.basics.lovableclone.dtos.subscription.CheckoutRequest;
import com.basics.lovableclone.dtos.subscription.CheckoutResponse;
import com.basics.lovableclone.dtos.subscription.PortalResponse;
import com.basics.lovableclone.dtos.subscription.SubscriptionResponse;
import com.basics.lovableclone.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {
    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
