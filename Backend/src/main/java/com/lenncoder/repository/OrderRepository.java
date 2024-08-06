package com.lenncoder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lenncoder.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	@Query("select o from Order o Where o.user.id=:userId AND (o.orderStatus = 'PLACED' OR o.orderStatus = 'CONFIRMED' OR o.orderStatus = 'SHIPPED' OR o.orderStatus = 'DELIVERED')")
	public List<Order> getUsersOrders(@Param("userId") Long userId);
	
	
}
