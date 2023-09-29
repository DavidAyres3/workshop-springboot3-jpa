package com.ayres.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayres.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
