package com.pgcarmona.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgcarmona.course.entities.Order;
import com.pgcarmona.course.services.OrderService;



@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
    
    @Autowired
    private OrderService orderService;

    @GetMapping()
    public ResponseEntity<List<Order>> getMethodName() {
        return ResponseEntity.ok(orderService.findAll());
    }

    @GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		return ResponseEntity.ok(orderService.findById(id));
	}
    
}
