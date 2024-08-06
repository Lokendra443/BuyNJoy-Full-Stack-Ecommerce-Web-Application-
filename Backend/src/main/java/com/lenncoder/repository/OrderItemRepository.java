package com.lenncoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lenncoder.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
