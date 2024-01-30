package com.alpdex.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpdex.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
