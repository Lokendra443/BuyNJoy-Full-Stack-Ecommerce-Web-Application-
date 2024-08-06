package com.lenncoder.service;

import java.util.List;

import com.lenncoder.entity.Rating;
import com.lenncoder.entity.User;
import com.lenncoder.exception.ProductException;
import com.lenncoder.request.RatingRequest;


public interface RatingService {
	
	public Rating createRating(RatingRequest req, User user)throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
