package com.example.User.service.exteenal.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.User.service.entity.Hotel;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {

	
	
	@GetMapping("/hotels/{hoteslid}")
	Hotel getvalueusingbyid(@PathVariable("hoteslid")String name);
}
