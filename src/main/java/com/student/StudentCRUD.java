package com.student;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCRUD extends JpaRepository<Student, Integer>{

	List<Student> findByIdAndName(int id,String name);
}