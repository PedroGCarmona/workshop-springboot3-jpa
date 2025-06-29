package com.pgcarmona.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgcarmona.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
