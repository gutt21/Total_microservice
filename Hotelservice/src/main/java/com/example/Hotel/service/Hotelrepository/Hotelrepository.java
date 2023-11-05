package com.example.Hotel.service.Hotelrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hotel.service.entity.Hotel;

public interface Hotelrepository extends JpaRepository<Hotel, String> {

	
	
}
