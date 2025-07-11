package com.pgcarmona.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgcarmona.course.entities.OrderItem;
import com.pgcarmona.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
