package com.basics.lovableclone.service.test;

import com.basics.lovableclone.dtos.user.UserRequestDTO;
import com.basics.lovableclone.dtos.user.UserResponseDTO;

import java.util.List;

public interface UserTestService {
    UserResponseDTO createUser(UserRequestDTO requestDTO);

    List<UserResponseDTO> getAllUsers();

    UserResponseDTO getUsersById(Long id);

    UserResponseDTO updateUser(Long id,UserRequestDTO requestDTO);

    void deleteUser(Long id);
}
