package com.app.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/student")
public class StudentRestController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping("/create")
	public Mono<Student> savee(@RequestBody Student stud){
		return service.save(stud);
	}
	
	@GetMapping("/fetch/{id}")
	public Mono<Student> fetchOne(@PathVariable("id")String id){
		return service.getOne(null);
	}
	
	
	@GetMapping("/fetchAll")
	public Flux<Student> gettAll(){
		return service.findall();
	}
	
	@DeleteMapping("/remove/{id}")
	public Mono<Void> deleteOne(@PathVariable String id) {
		return service.delete(id);
		/* service.delete(id);
		return Mono.just("Removed Id "+id); */
	}

}
