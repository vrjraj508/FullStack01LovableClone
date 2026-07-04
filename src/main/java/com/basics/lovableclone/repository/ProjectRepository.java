package com.basics.lovableclone.repository;

import com.basics.lovableclone.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {

}
