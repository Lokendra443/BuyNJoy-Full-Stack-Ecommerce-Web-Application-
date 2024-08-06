package com.lenncoder.service;

import com.lenncoder.entity.Cart;
import com.lenncoder.entity.User;
import com.lenncoder.exception.ProductException;
import com.lenncoder.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId, AddItemRequest req)throws ProductException;
	
	public Cart findUserCart(Long userId);

}
