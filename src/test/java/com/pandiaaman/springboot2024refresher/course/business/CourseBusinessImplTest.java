package com.pandiaaman.springboot2024refresher.course.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.pandiaaman.springboot2024refresher.course.service.CourseService;

@ExtendWith(MockitoExtension.class)
class CourseBusinessImplTest {

	
	@Test
	void findGreatestCourseIdSimple() {
		CourseService service = mock(CourseService.class);
		when(service.getAllCourseIds()).thenReturn(new int[] {1,2,3,4,2,6,1});
		CourseBusinessImpl obj = new CourseBusinessImpl(service);
		
		assertEquals(6, obj.getMaxCourseIdValue());
		
	}
	
	
	@Mock
	CourseService service;
	
	@InjectMocks
	CourseBusinessImpl businessObj;
	
	@Test
	void findGreatestCourseIdSimple_MockAnnotationExample() {
		when(service.getAllCourseIds()).thenReturn(new int[] {1,2,3,4,2,6,1});
		assertEquals(6, businessObj.getMaxCourseIdValue());
	}

}
