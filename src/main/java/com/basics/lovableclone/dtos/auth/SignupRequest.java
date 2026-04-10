package com.basics.lovableclone.dtos.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
