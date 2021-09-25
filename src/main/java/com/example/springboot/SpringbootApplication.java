package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.student.Student;
import com.student.StudentCRUD;

@SpringBootApplication
@ComponentScan(basePackages = {"com.controllers","com.student"})
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("project is running");
		
	}
	

}



