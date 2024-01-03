package com.pandiaaman.springboot2024refresher.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class MyMathTest { 

	
	private MyMath obj = new MyMath();
	
	
	@Test
	void testCalculateSum() {
		assertEquals(6, obj.calculateSum(new int[] {1,2,3}));
	}
	
	void testEmptyArraySum() {
		assertEquals(0, obj.calculateSum(new int[] {}));
	}
	
	@Test
	void testSuccess() {
		//absence of failure is success
//		fail("failed");
	}

}
