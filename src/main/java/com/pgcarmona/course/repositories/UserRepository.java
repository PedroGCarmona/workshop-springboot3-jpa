package com.pgcarmona.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgcarmona.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
