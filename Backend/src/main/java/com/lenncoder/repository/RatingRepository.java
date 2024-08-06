package com.lenncoder.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lenncoder.entity.Rating;

public interface RatingRepository extends JpaRepository<Rating, Long> {

	@Query("select r from Rating r Where r.product.id=:productId")
	public List<Rating> getAllProductsRating(@Param("productId") Long productId);
	
}
