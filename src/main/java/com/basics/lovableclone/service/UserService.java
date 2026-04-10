package com.basics.lovableclone.service;

import com.basics.lovableclone.dtos.auth.UserProfileResponse;

public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
