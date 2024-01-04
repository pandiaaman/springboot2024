package com.pandiaaman.springboot2024refresher.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pandiaaman.springboot2024refresher.course.entity.Course;

@Repository //class talking to the database
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = 
			"""
			INSERT INTO  COURSE(ID, NAME, AUTHOR) 
			VALUES (?,?,?);
			""";
	//3 double quotes is a text block, which means we can type anything we want
	
	
	public void insert(Course course) {
		//update method in spring jdbc is used to run insert, update and delete queries
		springJdbcTemplate.update(INSERT_QUERY,course.getCourseId(),course.getCourseName(),course.getCourseAuthor());
	}
	
	//delete query
	private static String DELETE_QUERY = 
			"""
			DELETE FROM COURSE WHERE ID=?;
			""";
	
	public void deleteById(int id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	//select query
	private static String SELECT_QUERY =
			"""
			SELECT * FROM COURSE WHERE ID=?;
			""";
	
	public Course selectById(int id) {
		//here the second parameter helps us to map the result set to the object of course
		//ResultSet ->>  Bean  ==> RowMapper
		//and the third parameter is the id we want to query
		Course fetchedCourse = springJdbcTemplate.queryForObject(SELECT_QUERY,  new BeanPropertyRowMapper<>(Course.class), id);
		return fetchedCourse;
	}
	
	
}
