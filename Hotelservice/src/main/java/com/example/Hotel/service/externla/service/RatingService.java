package com.example.Hotel.service.externla.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Hotel.service.entity.Rating;



@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

	
	 @GetMapping("/ratings/users/{ratingid}")
	  Rating[] getallratingbyusinguserid(@PathVariable("ratingid")String name);
	
	
}
