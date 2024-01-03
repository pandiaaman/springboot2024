package com.pandiaaman.springboot2024refresher.course.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.pandiaaman.springboot2024refresher.course.service.CourseService;

import lombok.AllArgsConstructor;

@AllArgsConstructor //constructor is necessary so that the service object can be instantiated
public class CourseBusinessImpl {

	@Autowired
	CourseService service;
	
	protected int getMaxCourseIdValue() {
		int[] fetchedIds = service.getAllCourseIds();
		int maxVal = Integer.MIN_VALUE;
		
		for(int id:fetchedIds) {
			if(id>maxVal) {
				maxVal = id;
			}
		}
		return maxVal;
	}
	
	
}
