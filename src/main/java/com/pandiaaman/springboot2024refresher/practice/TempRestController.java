package com.pandiaaman.springboot2024refresher.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
public class TempRestController {

	@GetMapping("/something")
	public String writeSomething() {
//		ResponseEntity<String> result = new ResponseEntity<String>("something", HttpStatusCode.valueOf(200));
		return "something";
	}
}
