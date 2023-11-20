package com.app.repository2;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity1.User;


public interface UserRepository  extends JpaRepository<User, Integer> {	
       
	   Optional<User>  findByUserEmail(String userEmail);
}
