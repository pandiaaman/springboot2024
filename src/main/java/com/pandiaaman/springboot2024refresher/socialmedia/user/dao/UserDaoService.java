package com.pandiaaman.springboot2024refresher.socialmedia.user.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.pandiaaman.springboot2024refresher.socialmedia.user.entity.User;

@Component
public class UserDaoService {

	//we store all user info in the databases
	//and we talk to the database
	
	//UserDaoService > Static list
	
	private static List<User> users = new ArrayList<User>(); 
	
	static {
		users.add(new User(UUID.randomUUID().toString(),"aman",LocalDate.now().minusYears(26)));
		users.add(new User(UUID.randomUUID().toString(),"aman1",LocalDate.now().minusYears(21)));
		users.add(new User(UUID.randomUUID().toString(),"aman2",LocalDate.now().minusYears(24)));
		users.add(new User(UUID.randomUUID().toString(),"aman3",LocalDate.now().minusYears(23)));
		users.add(new User(UUID.randomUUID().toString(),"aman4",LocalDate.now().minusYears(22)));
		users.add(new User(UUID.randomUUID().toString(),"aman5",LocalDate.now().minusYears(27)));
		users.add(new User(UUID.randomUUID().toString(),"aman6",LocalDate.now().minusYears(20)));
	}
	
	//public List<User> findAll();
	public List<User> findAll(){
		return users;
	}
	
	//public User save(User user);
	public User save(User user) {
		user.setUserId(UUID.randomUUID().toString());
		users.add(user);
		return user;
	}
	
	//public User findOne(String userId);
	public User findOne(String userId) {
		
		Predicate<? super User> predicate = user -> user.getUserId().equals(userId);	
//		return users.stream().filter(predicate).findFirst().get();
		
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
}
