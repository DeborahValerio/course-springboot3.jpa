package com.debproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
