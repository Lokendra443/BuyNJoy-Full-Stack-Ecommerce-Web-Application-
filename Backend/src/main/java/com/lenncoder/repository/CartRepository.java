package com.lenncoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lenncoder.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	@Query("select c from Cart c Where c.user.id=:userId")
	public Cart findByUserId(@Param("userId")Long userId);
	
}
