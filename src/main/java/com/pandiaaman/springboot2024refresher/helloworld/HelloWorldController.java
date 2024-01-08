package com.pandiaaman.springboot2024refresher.helloworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {

	@GetMapping(path="/main")
	private ResponseEntity<String> helloWorld(){
		return new ResponseEntity<String>("hello world", HttpStatus.ACCEPTED);
	}
	
	@GetMapping(path="/json")
	private ResponseEntity<HelloWorldPojo> helloWorldJson(){
		HelloWorldPojo pojo = new HelloWorldPojo();
		pojo.setAge(2);
		pojo.setName("aman");
		
		return new ResponseEntity<HelloWorldPojo>(pojo, HttpStatus.ACCEPTED);
	}
	
	//setting up path parameters:
	// /users/{userid}/todos/{todoid}
	
	
}
