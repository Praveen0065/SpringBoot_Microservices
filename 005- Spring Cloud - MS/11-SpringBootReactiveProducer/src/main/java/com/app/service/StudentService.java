package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.repo.StudentRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public Mono<Student> save(Student stud){
		return repo.save(stud);
	}
	
	public Mono<Student> getOne(String id){
		return repo.findById(id).switchIfEmpty(Mono.empty());
	}
	
	public Flux<Student> findall(){
		return repo.findAll();
	}
	
	
	
	public Mono<Void> delete(String id) {
		return repo.deleteById(id);
	}

}
