package com.basics.lovableclone.repository;

import com.basics.lovableclone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
