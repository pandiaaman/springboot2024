package com.pandiaaman.springboot2024refresher.functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		System.out.println("///streams///");
		
		List<String> names = Arrays.asList("aman","anisha","jiya");
		
		Stream<String> namesStream = names.stream();
		
		List<String> namesFilter = namesStream.filter(s -> s.contains("a")).collect(Collectors.toList());
		
		for(String s: namesFilter) {
			System.out.println(s);
		}
		
		System.out.println("streams");
		
		
		printAllNumbersStructured(List.of(12,4,6,7,3,4,23,44,67,5,77,21,12));
		printAllNumbersFunctional(List.of(12,4,6,7,3,4,23,44,67,5,77,21,12));
		printAllNumbersFunctionalUsingStatic(List.of(12,4,6,7,3,4,23,44,67,5,77,21,12));
		printAllEvenNumbersFunctional(List.of(12,4,6,7,3,4,23,44,67,5,77,21,12));
	}

	private static void printAllEvenNumbersFunctional(List<Integer> numbers) {
		numbers.stream().filter(x-> x%2==0).forEach(System.out::println);
		
	}

	private static void print(int n) {
		System.out.println(n);
	}
	
	private static void printAllNumbersFunctionalUsingStatic(List<Integer> numbers) {
		numbers.stream().forEach(Streams::print); //the class name :: method name
		
		//or even better without using an external method
		numbers.stream().forEach(System.out::println);
	}

	private static void printAllNumbersFunctional(List<Integer> numbers) {
		numbers.stream().forEach(x -> System.out.println(x));
		
	}

	private static void printAllNumbersStructured(List<Integer> numbers) {
		for(int n : numbers) {
			System.out.println(n);
		}
		
	}

}
