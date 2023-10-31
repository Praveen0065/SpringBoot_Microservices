package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Student;
import com.app.exception.StudentNotFoundException;
import com.app.service.IStudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/v1/api/student")
public class StudentController {
	
	@Autowired
	private IStudentService service;
	
	//1. create one student
	@PostMapping("/create")
	public ResponseEntity<String> createStudent(
			   @RequestBody @Valid Student stud
			   )
	{
	   Integer	id = service.saveStudent(stud);
	   String message = "STUDENT '"+id+ "' CREATED";
	   return new ResponseEntity<String>(message,HttpStatus.CREATED);
	}
	
	//2. fetch all students
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudnts(){
		List<Student> list = service.getAllStundents();
	   // return new ResponseEntity<List<Student>>(list,HttpStatus.OK);
		return ResponseEntity.ok(list);		 
		
	}
	
	//3. fetch one by id
	@GetMapping("/find/{id}")
	public ResponseEntity<Student> getOnestudnt(        
			  @PathVariable("id")Integer id
			)
    {
		ResponseEntity<Student> respon = null;
		
		try {
			Student s = service.getOneStudent(id);
			respon = ResponseEntity.ok(s);
			
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		
		   return respon;
	}
	
	//4. remove one by id
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteStud(
			@PathVariable("id")Integer id
			)
	{
		ResponseEntity<String> respons = null;
		try {
			service.deleteStudent(id);
			respons = ResponseEntity.ok("STUDENT '"+ id +"' REMOVED");
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return respons;
	}
	
	//5. update student
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStud(
			   @RequestBody Student stud
			   )
	{
		ResponseEntity<String> respons = null;
		try {
			service.updateStudent(stud);
			respons = ResponseEntity.ok("STUDENT '"+ stud.getStdId() +"' UPDATED");
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return respons;
	}

}
