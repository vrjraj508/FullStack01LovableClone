package com.basics.lovableclone.service;

import com.basics.lovableclone.dtos.auth.UserProfileResponse;
import org.springframework.stereotype.Service;


public interface UserService {
    UserProfileResponse getProfile(Long userId);
}
