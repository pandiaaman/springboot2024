package com.pandiaaman.springboot2024refresher.course.service;

import com.pandiaaman.springboot2024refresher.course.entity.Course;

public interface CourseService {

	public int[] getAllCourseIds();
	
	public String[] getAllCourseNames();
	
	public Course[] getAllCourses();
}
