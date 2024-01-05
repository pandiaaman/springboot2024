package com.pandiaaman.springboot2024refresher.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pandiaaman.springboot2024refresher.course.entity.Course;
import com.pandiaaman.springboot2024refresher.course.jdbc.CourseJdbcRepository;
import com.pandiaaman.springboot2024refresher.course.jpa.CourseJpaRepository;
import com.pandiaaman.springboot2024refresher.course.springdatajpa.CourseSpringDataJPARepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

	//command line runner by spring is a concept used for running selected 
	//commands or queries on startup of the application
	
//	@Autowired	
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJPARepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		//change save to insert if you want to try with JPA not springdata JPA
		repository.save(new Course(1, "learn AWS", "Aman Pandia"));
		repository.save(new Course(2, "learn Java", "Aman Pandia"));
		repository.save(new Course(3, "learn Devops", "Aman Pandia"));
		repository.save(new Course(4, "learn React", "Aman Pandia"));
		repository.save(new Course(5, "learn System design", "Aman Pandia"));
		repository.save(new Course(6, "learn SQL", "Aman Pandia"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		
		//finding all the courses
		System.out.println(repository.findAll());
		
		//using our custom method, to find the courses by a given author
//		System.out.println("finding courses by AUTHOR NAME");
//		System.out.println(repository.findByAuthor("Aman Pandia"));
	}

	
}
