package com.example.User.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.User.service.entity.User;

public interface Userrepository extends JpaRepository<User, String> {

	
	
	
}
