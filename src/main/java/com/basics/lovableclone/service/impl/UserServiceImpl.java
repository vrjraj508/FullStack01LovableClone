package com.basics.lovableclone.service.impl;

import com.basics.lovableclone.dtos.auth.UserProfileResponse;
import com.basics.lovableclone.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
