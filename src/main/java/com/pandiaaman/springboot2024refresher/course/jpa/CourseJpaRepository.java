package com.pandiaaman.springboot2024refresher.course.jpa;


import org.springframework.stereotype.Repository;

import com.pandiaaman.springboot2024refresher.course.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;



@Repository
@Transactional
public class CourseJpaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(int id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(int id) {
		Course courseToDelete = entityManager.find(Course.class, id);
		entityManager.remove(courseToDelete);
	}
}
