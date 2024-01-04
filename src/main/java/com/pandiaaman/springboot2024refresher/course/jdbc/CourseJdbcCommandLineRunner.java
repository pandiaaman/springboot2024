package com.pandiaaman.springboot2024refresher.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pandiaaman.springboot2024refresher.course.entity.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	//command line runner by spring is a concept used for running selected 
	//commands or queries on startup of the application
	
	@Autowired	
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(1, "learn AWS", "Aman Pandia"));
		repository.insert(new Course(2, "learn Java", "Aman Pandia"));
		repository.insert(new Course(3, "learn Devops", "Aman Pandia"));
		repository.insert(new Course(4, "learn React", "Aman Pandia"));
		repository.insert(new Course(5, "learn System design", "Aman Pandia"));
		repository.insert(new Course(6, "learn SQL", "Aman Pandia"));
		
		repository.deleteById(1);
		
		System.out.println(repository.selectById(2));
		
	}

	
}
