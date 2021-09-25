package com.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.Student;
import com.student.StudentCRUD;

@RestController
@RequestMapping("/api") // localhost:8000/api/ -> ye base URL ho gya ab
public class ExampleController {

	StudentCRUD crud;
	@GetMapping("/get")
	public String get() {
		return "this is get method";
	}
	@GetMapping("/getname")
	public String getName(@RequestParam(value="name") String name) {
		//localhost:8000/api/getname?name="radhakrishna"
		// to requestParam ye URL se name fetch kr lega
		return name;
	}
	@PostMapping("/post")
	public String post() {
		return "this is post method";
	}
	@PutMapping("/put")
	public String put() {
		return "this is put method";
	}
	@DeleteMapping("/delete")
	public String delete() {
		return "this is delete method";
	}
	@GetMapping("/sendResponse")
	public ResponseEntity<Student> sendResponse(){
		// if Student exists return Student
		int found=1;
		if(found==1)
			return new ResponseEntity<Student>(HttpStatus.OK);
		else
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
}
