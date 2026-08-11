package com.basics.lovableclone.mapper;

import com.basics.lovableclone.dtos.user.UserRequestDTO;
import com.basics.lovableclone.dtos.user.UserResponseDTO;
import com.basics.lovableclone.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target="id", ignore = true)
    @Mapping(target = "passwordHash",ignore = true)
    @Mapping(target="createdAt",ignore = true)
    @Mapping(target = "updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    User toEntity(UserRequestDTO userRequest);

    UserResponseDTO toResponse(User user);

    @Mapping(target="id",ignore = true)
    @Mapping(target="passwordHash",ignore = true)
    @Mapping(target = "createdAt",ignore = true)
    @Mapping(target="updatedAt",ignore = true)
    @Mapping(target = "deletedAt",ignore = true)
    void updateEntity(UserRequestDTO requestDTO, @MappingTarget User user);

}
