package com.basics.lovableclone.entity;

import com.basics.lovableclone.entity.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription {

    Long id;
    User user;
    Plan plan;

    SubscriptionStatus status;

    String stripCustomerId;
    String stripeSubscriptionId;

    Instant currentPeriodStart;
    Instant currentPeriodEnd;

    Instant createdAt;
    Instant updatedAt;
}
