package com.app.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.app.entity.Student;

import reactor.core.publisher.Flux;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {
	
	//public Flux<Student> getByName(String name);
	
	

}
