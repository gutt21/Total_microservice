package com.example.User.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.User.service.entity.User;

@Service
public interface UserService {

	
	User usersave(User user);
	
	
	List<User> getAlluser();
	
	
	User getuserid(String id);
	
}
