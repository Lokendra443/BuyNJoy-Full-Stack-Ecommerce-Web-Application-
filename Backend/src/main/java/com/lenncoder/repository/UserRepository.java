package com.lenncoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lenncoder.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByEmail(String email);

}
