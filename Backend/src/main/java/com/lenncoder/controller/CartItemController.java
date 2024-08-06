package com.lenncoder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lenncoder.entity.User;
import com.lenncoder.exception.CartItemException;
import com.lenncoder.exception.UserException;
import com.lenncoder.response.ApiResponse;
import com.lenncoder.service.CartItemService;
import com.lenncoder.service.UserService;

@RestController
@RequestMapping("/api/cart_items")
public class CartItemController {
	
	@Autowired
	private CartItemService cartItemService;
	
	@Autowired
	private UserService userService;
	
	
	@DeleteMapping("/{cartItemId}")
	public ResponseEntity<ApiResponse>deleteCartItem(@PathVariable Long cartItemId, @RequestHeader("Authorization")String jwt)throws UserException, CartItemException{
		
		User user = userService.findUserProfileByJwt(jwt);
		cartItemService.removeCartItem(user.getId(), cartItemId);
		
		ApiResponse res = new ApiResponse();
		res.setMessage("Delete Item form Cart");
		res.setStatus(true);
		return new ResponseEntity<>(res,HttpStatus.OK);
		
		
	}
	
	

}
