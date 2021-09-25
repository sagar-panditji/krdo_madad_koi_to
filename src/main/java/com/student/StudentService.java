package com.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class StudentService {

	@Autowired
	public StudentCRUD crud;
	
	public Optional<Student> getstudentById(int id) {
		return crud.findById(id);
	}
	public List<Student> getAllStudents(){
		System.out.println("service chala");
		List<Student> l = new ArrayList<Student>();
		crud.findAll().forEach(l::add);
		return l;
	}
	public void createStudent(Student s) {
		crud.save(s);
	}
	public void updateStudent(int id,Student s) {
		crud.save(s); // if object with id already there to update else create
	}
	public void deleteStudent(int id) {
		crud.deleteById(id);
	}
}
