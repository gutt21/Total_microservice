package com.example.rating.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rating.service.entity.rating;

public interface ratingrepository  extends JpaRepository<rating, Long>{

	
	List<rating> findByUserid(String userid);
	
	List<rating> findByHotelid(String hotelid);
	
	
}
