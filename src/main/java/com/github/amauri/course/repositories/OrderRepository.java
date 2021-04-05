package com.github.amauri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.amauri.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
