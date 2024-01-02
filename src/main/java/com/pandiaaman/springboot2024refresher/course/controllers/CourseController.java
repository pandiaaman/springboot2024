package com.pandiaaman.springboot2024refresher.course.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pandiaaman.springboot2024refresher.course.entity.Course;

@RestController
@RequestMapping("/course")
public class CourseController {

	@GetMapping("/all")
	public List<Course> listAllCourses(){
		
		Course course1 = new Course(1, "intro to java", "aman pandia");
		Course course2 = new Course(2, "advanced java", "aman pandia");
		Course course3 = new Course(3, "microservices", "some author");
		
		Course[] courseArray = new Course[] {course1, course2, course3};
		
		List<Course> allCourses = Arrays.asList(courseArray);
		
		return allCourses;
	}
	
	@GetMapping("/one")
	public ResponseEntity<Course> listCourse(){
		Course course = new Course(1, "intro to java", "aman pandia");
		
		ResponseEntity<Course> result = new ResponseEntity<Course>(course, HttpStatus.FOUND);
		
		return result;
	}
}
