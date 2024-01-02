package com.pandiaaman.springboot2024refresher.junit;

public class MyMath {

	public int calculateSum(int[] numbers) {
		int sum = 0;
		for(int num:numbers) {
			sum+=num;
		}
		return sum;
	}
}
