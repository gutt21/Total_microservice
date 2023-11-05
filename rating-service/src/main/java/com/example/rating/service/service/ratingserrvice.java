package com.example.rating.service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.rating.service.entity.rating;

@Service
public interface ratingserrvice {

	
	rating created(rating rating);
	
	List<rating> getvaluebysingleuserid(String userid);
	
	List<rating> getvaluebysinglehotelid(String hotelid);
	
	List<rating> listallvaue();
	
	
}
