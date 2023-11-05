package com.example.User.service.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.User.service.entity.User;
import com.example.User.service.serviceipl.Userserviceimpl;

import ch.qos.logback.classic.Logger;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/users")
public class Usercontroller {

	@Autowired
	private Userserviceimpl userservice;
	
	
	
	private org.slf4j.Logger logger=LoggerFactory.getLogger(Usercontroller.class);
	
	@PostMapping
	public ResponseEntity<User> create(@RequestBody User user) {
	      User user1= userservice.usersave(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	
	
	//single user get value
	int recount=1;
	
	@GetMapping("/{userid}")
	//@CircuitBreaker(name = "ratingservicircuit",fallbackMethod = "ratingHotelfallback")
	@Retry(name = "RatingHotelService",fallbackMethod = "ratingHotelfallback")
	//@RateLimiter(name = "userratelimiter",fallbackMethod = "ratingHotelfallback")
	public ResponseEntity<User> getvaluesingleid(@PathVariable("userid") String userid){
		User user1=userservice.getuserid(userid);
		logger.info("retry count: {}",recount++ +" times "+ " at "+ new Date());
		System.out.println("retry count: {} "+recount++ +" times "+ " at "+ new Date());
		return ResponseEntity.ok(user1);
		
	}
	
	
	//create fallback methode
	public ResponseEntity<User> ratingHotelfallback(String userid,Exception ex){
		
		User user=User.builder()
				  .email("dummy@gmail.com")
				  .name("Dummy")
				  .about("This user creat dummy beacuse some Rating service id down")
				  .userid("12345")
				  .build();
		
		return new ResponseEntity<>(user,HttpStatus.OK);
	}
	
	
	
	
	@GetMapping
	public ResponseEntity<List<User>> getallvalue(){
		 List<User> user=userservice.getAlluser();
	     return ResponseEntity.ok(user);
	}
	
	
}
