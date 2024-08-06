package com.lenncoder.service;

import com.lenncoder.entity.User;
import com.lenncoder.exception.UserException;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
