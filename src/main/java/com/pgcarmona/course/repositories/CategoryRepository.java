package com.pgcarmona.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgcarmona.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
