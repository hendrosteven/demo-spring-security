package com.bca.repo;

import org.springframework.data.repository.CrudRepository;

import com.bca.entity.User;

public interface UserRepo  extends CrudRepository<User, Long>{
	
	public User findByEmail(String email);
}
