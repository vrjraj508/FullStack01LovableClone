package com.basics.lovableclone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="users")
public class User {

     @Id
     private Long id1;
     Long id;
     String email;
     String passwordHash;
     String name;
     String avatarUrl;

     Instant createdAt;
     Instant updatedAt;


     Instant deletedAt;

}
