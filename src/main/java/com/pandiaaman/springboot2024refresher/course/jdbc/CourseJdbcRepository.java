package com.pandiaaman.springboot2024refresher.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository //class talking to the database
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
			INSERT INTO  COURSE(ID, NAME, AUTHOR) 
			VALUES (1, 'Learn AWS', 'Aman Pandia');
			""";
	//3 double quotes is a text block, which means we can type anything we want
	
	
	public void insert() {
		//update method in spring jdbc is used to run insert, update and delete queries
		springJdbcTemplate.update(INSERT_QUERY);
	}
	
}
