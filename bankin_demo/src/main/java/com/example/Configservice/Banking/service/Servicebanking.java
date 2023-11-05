package com.example.Configservice.Banking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Configservice.Banking.model.Banking;
import com.example.Configservice.Banking.repository.bankingrepository;

@Service
public class Servicebanking {

	
	@Autowired
	private bankingrepository reBankingrepository;
	
	
	
	
	
	public Banking save(Banking banking) {
		Banking banking2 = reBankingrepository.save(banking);
		return banking2;
		
	}
	
	
	public void deleted(int id) {
		reBankingrepository.deleteById(id);
	}
	
	
	
	
}
