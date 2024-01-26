package com.alpdex.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpdex.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
