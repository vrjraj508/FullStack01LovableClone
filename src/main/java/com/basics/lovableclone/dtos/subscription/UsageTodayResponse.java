package com.basics.lovableclone.dtos.subscription;

public record UsageTodayResponse(
        int  tokenUsed,
        int tokensLimit,
        int previewRunning,
        int previewsLimit

) {
}
