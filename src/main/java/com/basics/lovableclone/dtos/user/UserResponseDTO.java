package com.basics.lovableclone.dtos.user;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponseDTO {
    Long id;
    String email;
    String name;
    String avatarUrl;
    Instant createdAt;
    Instant updatedAt;

}
