package com.example.Hotel.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hotel.service.entity.Hotel;
import com.example.Hotel.service.service.hotelservice;
import com.example.Hotel.service.serviceimpl.hotelserviceimpl;

@RestController
@RequestMapping("/hotels")
public class hotelcontroller {

	
	@Autowired
	private hotelserviceimpl hotelservice;
	
	
	@PostMapping
	public ResponseEntity<Hotel> created(@RequestBody Hotel hotel){
		Hotel hotel1=hotelservice.created(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
	}
	
	
	@GetMapping("/{hotelid}")
	public ResponseEntity<Hotel> getsingleid(@PathVariable("hotelid") String id) {
	     Hotel hotel=hotelservice.gethotelbyid(id);
	     return ResponseEntity.ok(hotel);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Hotel>> getallhotels(){
	  List<Hotel>	hotel=hotelservice.getallhotels();
	  return ResponseEntity.ok(hotel);
	}
	
	
	
}
