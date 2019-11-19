package com.spring.rentacar.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.spring.rentacar.demo.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer>{
	
	//Student save(Student student);

}
