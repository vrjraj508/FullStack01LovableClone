package com.basics.lovableclone.dtos.subscription;

import java.time.Instant;

public record SubscriptionResponse(
   PlanResponse plan,
   String status,
   Instant period,
   Long tokensUsedThisCycle

) {
}
