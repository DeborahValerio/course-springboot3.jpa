package com.debproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debproject.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
