package com.example.actuatorservice.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.actuatorservice.dto.Student;

@RestController
public class HelloWorldController {
	
	@PostMapping("/insertStudent")
	public Student insertStudent(@RequestBody Student student) {
		System.out.println("student details: "+student);
		return student;
		
	}

	@GetMapping("/greetings")
	public String sayHello() {
		return "Good morning!";

	}

	@GetMapping("/students")
	public Student getStudents() {
		return new Student(1,"abc","9898");
	}

}
