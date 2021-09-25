package com.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.Student;
import com.student.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/hello")
	public Student getStudent() {
		return new Student(1,"RadheShyam");
	}
	@GetMapping("/hi/{id}/{name}")// yha maine 2 id & name URL se fetch kre and ve hi argument mai jaa rhe h 
	public Student getStudentByIDandName(@PathVariable("id") int id,@PathVariable("name") String name) {
		return new Student(id,name);
	}
	@GetMapping("/get/{id}")
	public Optional<Student> getstudentbyId(@PathVariable("id") int id) {
		return service.getstudentById(id);
	}
	@GetMapping("/getall")
	public List<Student> getAllStudents() {
		System.out.println("hello");
		List<Student> l=service.getAllStudents();
		System.out.println(l);
		return l;
	}
	@PostMapping("/create")
	public void createStudent(@RequestBody Student s) {
		System.out.println("post chala");
		service.createStudent(s);
	}
	@PutMapping("/put/{id}")
	public void updateStudent(@PathVariable("id") int id,@RequestBody Student s) {
		service.updateStudent(id,s);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable("id") int id) {
		service.deleteStudent(id);
	}
}
