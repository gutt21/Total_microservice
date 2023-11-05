package com.example.Configservice.Banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Configservice.Banking.model.Banking;
import java.util.List;


public interface bankingrepository extends JpaRepository<Banking, Integer> {

	
	
	
	Banking findById(int id);
	
}
