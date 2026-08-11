package com.basics.lovableclone.service.test.impl;

import com.basics.lovableclone.dtos.user.UserRequestDTO;
import com.basics.lovableclone.dtos.user.UserResponseDTO;
import com.basics.lovableclone.entity.User;
import com.basics.lovableclone.mapper.UserMapper;
import com.basics.lovableclone.repository.UserRepository;
import com.basics.lovableclone.service.test.UserTestService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)

public class UserTestServiceImpl implements UserTestService {

    UserRepository userRepository;
    UserMapper userMapper;

    @Override
    public UserResponseDTO createUser(UserRequestDTO requestDTO) {
        if(userRepository.existsByEmail(requestDTO.getEmail())){
            throw new RuntimeException("Email Already Exists: "+ requestDTO.getEmail());
        }

        User user = userMapper.toEntity(requestDTO);
        user.setPasswordHash(requestDTO.getPassword());
        User saved = userRepository.save(user);

        return userMapper.toResponse(saved);
    }

    @Override
    public List<UserResponseDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toResponse)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public UserResponseDTO getUsersById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found with id:"+id));

        return userMapper.toResponse(user);
    }

    @Override
    public UserResponseDTO updateUser(Long id, UserRequestDTO requestDTO) {
       User user = userRepository.findById(id)
               .orElseThrow(()-> new RuntimeException("User not found with id:"+id));

       userMapper.updateEntity(requestDTO,user);
       return  userMapper.toResponse(userRepository.save(user));
    }

    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not found with id:"+id));

        user.setDeletedAt(Instant.now());
        userRepository.save(user);

    }
}
