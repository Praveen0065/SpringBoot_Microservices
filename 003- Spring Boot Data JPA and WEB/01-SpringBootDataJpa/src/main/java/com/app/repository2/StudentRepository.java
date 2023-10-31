package com.app.repository2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity1.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

}
