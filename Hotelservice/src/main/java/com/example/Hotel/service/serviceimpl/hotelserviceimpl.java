package com.example.Hotel.service.serviceimpl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.Hotel.service.Hotelrepository.Hotelrepository;
import com.example.Hotel.service.entity.Hotel;
import com.example.Hotel.service.entity.Rating;
import com.example.Hotel.service.service.hotelservice;
import com.example.User.service.exception.ResourceNotFoundException;

@Service
public class hotelserviceimpl implements hotelservice {

	@Autowired
	private Hotelrepository hotelrepo;
	
	@Autowired
	private RestTemplate resttemple;
	
	@Override
	public Hotel created(Hotel hotel) {
		String userid=UUID.randomUUID().toString();
		hotel.setId(userid);
	    Hotel hotel1=hotelrepo.save(hotel);
		return hotel1;
	}

	@Override
	public List<Hotel> getallhotels() {
		List<Hotel> list=hotelrepo.findAll();
		return list;
	}

	@Override
	public Hotel gethotelbyid(String id) {
		Hotel hotel=hotelrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User has given id is not found on server !!"+id));
		Rating[] forObject = resttemple.getForObject("http://RATING-SERVICE/ratings/hotels/"+hotel.getId(), Rating[].class);
		List<Rating> asList = Arrays.asList(forObject);
		hotel.setRating(asList);
		return hotel;
	}

}
