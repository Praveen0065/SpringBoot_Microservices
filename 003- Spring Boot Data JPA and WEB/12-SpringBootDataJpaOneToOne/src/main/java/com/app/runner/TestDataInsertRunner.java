package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Role;
import com.app.entity.User;
import com.app.repository.Rolerepository;
import com.app.repository.UserRepository;

@Component
public class TestDataInsertRunner implements CommandLineRunner {
	
	@Autowired
	private Rolerepository rRepo;
	
	@Autowired
	private UserRepository uRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Role r1 = new Role(503, "ADMIN");
		Role r2 = new Role(504, "GUEST");
		
		rRepo.save(r1);
		rRepo.save(r2);
		
		User u1 = new User(10,"SYED", r1);
		User u2 = new User(11,"SAM", r2);
		
		
		uRepo.save(u1);
		uRepo.save(u2);
		
		
		
		
		
	}

}
