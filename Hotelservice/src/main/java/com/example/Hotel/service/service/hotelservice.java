package com.example.Hotel.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Hotel.service.entity.Hotel;

@Service
public interface hotelservice {

	Hotel created(Hotel hotel);
	
	List<Hotel> getallhotels();
	
	Hotel gethotelbyid(String id);
		
	
	
	
}
