package com.pandiaaman.springboot2024refresher.functionalprogramming;

import java.util.List;

public class StreamsExcercise1 {

	public static void main(String[] args) {
		System.out.println("printing only the odd numbers in the list");
		printOddNumbers(List.of(11,12,4,2,3,5,13,16,234,67));
		
		System.out.println("print courses whose name has atleast 4 letters");
		printCoursesAtleast4Letters(List.of("spring", "springboot", "aws", "devops", "c++", "c"));
	}

	private static void printCoursesAtleast4Letters(List<String> courses) {
		courses.stream().filter(x -> x.length()>=4).forEach(System.out::println);
		
		
	}

	private static void printOddNumbers(List<Integer> numbers) {
		numbers.stream().filter(x -> x%2!=0).forEach(System.out::println);
		
		
	}
}
