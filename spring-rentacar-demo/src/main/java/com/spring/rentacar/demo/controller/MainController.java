package com.spring.rentacar.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rentacar.demo.model.Student;
import com.spring.rentacar.demo.service.StudentService;

@RestController
public class MainController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/hello")
	public String greetings() {
	 return "Hey hello!!"	;
	}
	
	@PostMapping("/hello")
	public String greetings2() {
		 return "Hey hello!! from post"	;
		}
	
	@PostMapping("/student")
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
	
	@GetMapping("/student")
	public ResponseEntity<Student> findStudent(@RequestParam int sid) {
		Student student = studentService.findByStudentId(sid);
		if(null == student) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok().body(student);
		}
		
		
		 
	}

}
