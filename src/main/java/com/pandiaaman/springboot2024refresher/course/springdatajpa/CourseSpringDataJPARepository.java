package com.pandiaaman.springboot2024refresher.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pandiaaman.springboot2024refresher.course.entity.Course;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Integer>{

}
