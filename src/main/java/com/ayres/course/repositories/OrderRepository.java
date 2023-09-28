package com.ayres.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayres.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	
}
