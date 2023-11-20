package com.app.repo3;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity1.User;


public interface UserRepository  extends JpaRepository<User, Integer>{

	
	Optional<User> findByUsername(String username);
}
