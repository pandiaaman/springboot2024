package com.pandiaaman.springboot2024refresher.practice;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/temp")
public class TempRestController {

	@GetMapping("/something")
	public ResponseEntity<String> writeSomething() {
		ResponseEntity<String> result = new ResponseEntity<String>("something", HttpStatusCode.valueOf(200));
		return result;
	}
}
