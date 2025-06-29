package com.pgcarmona.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgcarmona.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
