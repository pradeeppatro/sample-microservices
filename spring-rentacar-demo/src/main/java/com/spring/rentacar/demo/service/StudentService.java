package com.spring.rentacar.demo.service;

import com.spring.rentacar.demo.model.Student;

public interface StudentService {

	Student save(Student student);
	Student findByStudentId(int id);
}
