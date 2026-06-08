package com.basics.lovableclone.service;

import com.basics.lovableclone.dtos.subscription.CheckoutRequest;
import com.basics.lovableclone.dtos.subscription.CheckoutResponse;
import com.basics.lovableclone.dtos.subscription.PortalResponse;
import com.basics.lovableclone.dtos.subscription.SubscriptionResponse;
import org.springframework.stereotype.Service;


public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
