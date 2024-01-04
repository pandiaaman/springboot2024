package com.pandiaaman.springboot2024refresher.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	//command line runner by spring is a concept used for running selected 
	//commands or queries on startup of the application
	
	@Autowired	
	private CourseJdbcRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert();
	}

	
}
