package com.pandiaaman.springboot2024refresher.socialmedia.user.errors;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ErrorDetails{

	//timestamp
	//message
	//details
	private LocalDateTime timestamp;
	private String message;
	private String details;
	
}
