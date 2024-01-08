package com.pandiaaman.springboot2024refresher.socialmedia.user.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pandiaaman.springboot2024refresher.socialmedia.user.dao.UserDaoService;
import com.pandiaaman.springboot2024refresher.socialmedia.user.entity.User;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserDaoService dao;
	
	@GetMapping(path="/")
	public ResponseEntity<List<User>> findAll(){
		List<User> allUsers = dao.findAll();
		return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
	}
	
	@GetMapping(path="/{userId}")
	public ResponseEntity<User> findOne(@PathVariable String userId){
		User fetchedUser = dao.findOne(userId);
		return new ResponseEntity<User>(fetchedUser, HttpStatus.OK);
	}
	
	@PostMapping(path="/")
	public ResponseEntity<User> save(@RequestBody User user){
		User savedUser = dao.save(user);
		
		//creating the URI of created user for the API consumer
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{userId}")
				.buildAndExpand(savedUser.getUserId())
				.toUri();

		return ResponseEntity.created(location ).build();
	}
	
	
}
