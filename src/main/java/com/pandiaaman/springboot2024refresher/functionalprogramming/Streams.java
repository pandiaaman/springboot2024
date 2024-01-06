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
		
		
	}

}
