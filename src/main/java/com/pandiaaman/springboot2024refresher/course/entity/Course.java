package com.pandiaaman.springboot2024refresher.course.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {

	
	private int courseId;
	
	private String courseName;
	
	private String courseAuthor;
}
