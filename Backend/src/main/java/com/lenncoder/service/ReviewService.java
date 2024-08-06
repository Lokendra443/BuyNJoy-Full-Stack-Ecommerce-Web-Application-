package com.lenncoder.service;

import java.util.List;

import com.lenncoder.entity.Review;
import com.lenncoder.entity.User;
import com.lenncoder.exception.ProductException;
import com.lenncoder.request.ReviewRequest;

public interface ReviewService {
	
	public Review createReview(ReviewRequest req, User user)throws ProductException;
	
	public List<Review>getAllReview(Long productId);

}
