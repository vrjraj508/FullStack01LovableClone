package com.basics.lovableclone.dtos.auth;

public record AuthResponse<UserProfileResponse>(
        String token,
        UserProfileResponse user
) {


}

//dummy : New Auth Response