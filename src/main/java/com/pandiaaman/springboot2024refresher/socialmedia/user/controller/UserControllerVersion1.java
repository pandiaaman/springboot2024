package com.pandiaaman.springboot2024refresher.socialmedia.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pandiaaman.springboot2024refresher.socialmedia.user.dao.UserDaoService;
import com.pandiaaman.springboot2024refresher.socialmedia.user.entity.User;

@RestController
@RequestMapping("/users")
public class UserControllerVersion1 {

	@Autowired
	UserDaoService dao;
	
	@GetMapping(path="/url/v1/")
	public ResponseEntity<List<User>> findAll(){
		List<User> allUsers = dao.findAll();
		return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
	} 
	
	
	@GetMapping(path="/requestparam", params = "version=1")
	public ResponseEntity<List<User>> findAllUsingRequestParameterVersioning(){
		List<User> allUsers = dao.findAll();
		return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
	} 
	
	@GetMapping(path="/headers", headers = "API-VERSION=1")
	public ResponseEntity<List<User>> findAllUsingHeaderVersioning(){
		List<User> allUsers = dao.findAll();
		return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
	} 
	
	
}
