package com.pandiaaman.springboot2024refresher.functionalprogramming;

import java.util.List;

public class StreamsExcercise2 {

	public static void main(String[] args) {
		System.out.println("print squares of the numbers in the list");
		printSquares(List.of(1,2,3,5,6,7));
		
		System.out.println("cubes of odd numbers");
		cubesOfOddNums(List.of(1,2,3,4,5,6,7));
		
		
	}

	private static void cubesOfOddNums(List<Integer> numbers) {
		numbers.stream().filter(x -> x%2!=0).map(x -> x*x*x).forEach(System.out::println);
	}

	private static void printSquares(List<Integer> numbers) {
		numbers.stream().map(x -> x*x).forEach(System.out::println);
	}
}
