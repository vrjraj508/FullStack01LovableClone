package com.basics.lovableclone.entity;

import jakarta.persistence.Entity;
import jdk.jfr.DataAmount;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults()
public class User {

     Long id;
     String email;
     String passwordHash;
     String name;
     String avatarUrl;

     Instant createdAt;
     Instant updatedAt;


     Instant deletedAt; //Soft Delete

}

//Here we are using the camel case notation to write vairables in this program
/*
-- WE are using private to maintain the giveb
*
* */