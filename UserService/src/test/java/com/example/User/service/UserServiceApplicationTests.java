package com.example.User.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.example.User.service.entity.Rating;
import com.example.User.service.exteenal.service.RatingService;

@SpringBootTest
class UserServiceApplicationTests {

	//@Test
	void contextLoads() {
	}

	@Autowired
	private RatingService ratingservice;
	
	@Test
	public void testrating() {
		Rating rating=Rating.builder().ratingid("1234").userid("45")
				      .Hotelid("222").feedback("it is very nice").rating(5).build();
		ResponseEntity<Rating> created = ratingservice.created(rating);
		
	}
	
	
	
	
}
