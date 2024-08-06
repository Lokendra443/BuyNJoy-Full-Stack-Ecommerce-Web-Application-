package com.lenncoder.service;

import com.lenncoder.entity.Cart;
import com.lenncoder.entity.CartItem;
import com.lenncoder.entity.Product;
import com.lenncoder.exception.CartItemException;
import com.lenncoder.exception.UserException;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id, CartItem cartItem)throws CartItemException, UserException;

	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId);
	
	public void removeCartItem(Long userId, Long cartItemId)throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId)throws CartItemException;
	
}
