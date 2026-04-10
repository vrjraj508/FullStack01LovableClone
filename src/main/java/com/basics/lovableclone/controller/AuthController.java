package com.basics.lovableclone.controller;

import com.basics.lovableclone.dtos.auth.AuthResponse;
import com.basics.lovableclone.dtos.auth.LoginRequest;
import com.basics.lovableclone.dtos.auth.SignupRequest;
import com.basics.lovableclone.dtos.auth.UserProfileResponse;
import com.basics.lovableclone.service.AuthService;
import com.basics.lovableclone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private AuthService authService;
    private UserService userService;

    public AuthController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signup(SignupRequest request){
       return ResponseEntity.ok(authService.signup(request));
   }

   @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(LoginRequest request){
       return ResponseEntity.ok(authService.login(request));
   }

   @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
       Long userId = 1L;

       return ResponseEntity.ok(userService.getProfile(userId));
   }




}
