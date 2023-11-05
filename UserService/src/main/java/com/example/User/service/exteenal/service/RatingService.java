package com.example.User.service.exteenal.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.User.service.entity.Rating;



@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

	  @GetMapping("/ratings/users/{ratingid}")
      Rating[] getallratingbyusinguserid(@PathVariable("ratingid")String name);
	
	  @GetMapping("/ratings")
	  Rating[] getallratings();
	  
	  
	  
	  @PostMapping("/ratings")
	  ResponseEntity<Rating> created(Rating rating);
	 
	  @PutMapping("/ratings/{ratingid}")
	  Rating update(@PathVariable("ratingid")String name,Rating rating);
	
	  @DeleteMapping("/ratings/{ratingid}")
	  Rating delete(@PathVariable("ratingid")String name);
	
}
