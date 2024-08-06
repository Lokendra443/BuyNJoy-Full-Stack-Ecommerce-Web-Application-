package com.lenncoder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lenncoder.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

	Address save(Address shippingAddress);

}
