package com.alpdex.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpdex.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
