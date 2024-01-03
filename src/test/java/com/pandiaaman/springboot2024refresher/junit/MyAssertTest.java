package com.pandiaaman.springboot2024refresher.junit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {

	List<String> todos = Arrays.asList("AWS","Kafka","Frontend");
	
	@Test
	void test() {
		boolean test = todos.contains("AWS");
		
		assertEquals(true, test);
		
		assertEquals(3, todos.size());
		
		assertArrayEquals(new int[] {1,2,3}, new int[] {1,2,3});
	}

}
