package com.pandiaaman.springboot2024refresher.functionalprogramming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalClassConcept {

	public static void main(String[] args) {
		List<String> fruits = List.of("apple","orange","banana","lichi","watermelon");
		
		//printing the first fruit that starts with a "b"
		//we can assign the value of a calculation directly to a local variable by pressing ctrl + 1
		Optional<String> findFirst = fruits.stream().filter(x -> x.startsWith("b")).findFirst();
		//Optional here is automatically determined
		//optional comes for variables that can be null 
		System.out.println(findFirst);
		System.out.println(findFirst.isEmpty());
		System.out.println(findFirst.isPresent());
		System.out.println(findFirst.get());
		
		
		//WHAT is predicate?
		//the value inside the filter is called perdicate
		
		Predicate<? super String> predicate = x -> x.startsWith("k");
		Optional<String> findFirst2 = fruits.stream().filter(predicate).findFirst();
		
		System.out.println(findFirst2); //since no fruit with k it prints optional.empty
	}
}
