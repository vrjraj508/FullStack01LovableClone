package com.basics.lovableclone.service;

import com.basics.lovableclone.dtos.auth.AuthResponse;
import com.basics.lovableclone.dtos.auth.LoginRequest;
import com.basics.lovableclone.dtos.auth.SignupRequest;
import org.springframework.stereotype.Service;


public interface AuthService {


    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
