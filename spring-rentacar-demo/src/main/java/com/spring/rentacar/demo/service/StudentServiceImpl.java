package com.spring.rentacar.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rentacar.demo.model.Student;
import com.spring.rentacar.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	
	public Student save(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}
	
	public Student findByStudentId(int id) {
		Optional<Student> student = studentRepository.findById(id);
		
		if(student.isPresent()) {
			return student.get();
		}
		
			return null;
		
		//return studentRepository.findById(id);
	}

}
