package com.pandiaaman.springboot2024refresher.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pandiaaman.springboot2024refresher.course.entity.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Integer>{

	//spring data jpa provides us a whole set of methods to play with and get our required data
	// methods like save, find, findAll, deleteByID, findById etc
	
	//writing our own custom methods
		//to do this we need to follow a naming convention
	
//	List<Course> findByAuthor(String author);
}
