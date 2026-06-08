package com.basics.lovableclone.service.impl;

import com.basics.lovableclone.dtos.auth.AuthResponse;
import com.basics.lovableclone.dtos.auth.LoginRequest;
import com.basics.lovableclone.dtos.auth.SignupRequest;
import com.basics.lovableclone.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
