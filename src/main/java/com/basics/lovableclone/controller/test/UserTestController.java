package com.basics.lovableclone.controller.test;

import com.basics.lovableclone.dtos.user.UserRequestDTO;
import com.basics.lovableclone.dtos.user.UserResponseDTO;
import com.basics.lovableclone.service.UserService;
import com.basics.lovableclone.service.test.UserTestService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test/users")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class UserTestController {

    UserTestService userTestService;
    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserRequestDTO userRequestDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(userTestService.createUser(userRequestDTO));
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> getAllUsers(){
        return ResponseEntity.ok(userTestService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable Long id){
        return ResponseEntity.ok(userTestService.getUsersById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponseDTO> updateUser(@PathVariable Long id,@RequestBody UserRequestDTO requestDTO){
        return ResponseEntity.ok(userTestService.updateUser(id,requestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userTestService.deleteUser(id);

        return ResponseEntity.noContent().build();
    }




}
