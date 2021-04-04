package com.github.amauri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.amauri.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
