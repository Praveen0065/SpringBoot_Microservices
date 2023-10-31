package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface IStudentService {
	
	Integer saveStudent(Student s);
	void updateStudent(Student s);
	void deleteStudent(Integer id);
	Student getOneStudent(Integer id);
	List<Student> getAllStundents();

}
