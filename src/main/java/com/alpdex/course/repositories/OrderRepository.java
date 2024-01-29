package com.alpdex.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpdex.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
