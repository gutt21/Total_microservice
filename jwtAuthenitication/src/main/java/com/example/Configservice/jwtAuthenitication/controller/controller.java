package com.example.Configservice.jwtAuthenitication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Configservice.jwtAuthenitication.service.serviceimp;

@RestController
@RequestMapping("/user")
public class controller {

	
	
	private serviceimp server;
	
	@GetMapping("/home")
	public String getuser() {
		
		return "akash";
	}
	
	
	public String postmethode() {
		return null;
		
	}
	
	
	
	
	
	
}
