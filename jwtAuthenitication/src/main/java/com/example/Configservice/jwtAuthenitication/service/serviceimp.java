package com.example.Configservice.jwtAuthenitication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Configservice.jwtAuthenitication.entity.User;
import com.example.Configservice.jwtAuthenitication.repository.Userrepository;

@Service
public class serviceimp {

	
	
	@Autowired
	private Userrepository repo;
	
	
	
	public User creted(User user) {
		User save = repo.save(user);
		return save;
	}
	
	
	
}
