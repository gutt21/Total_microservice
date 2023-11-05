package com.example.rating.service.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rating.service.entity.rating;
import com.example.rating.service.repository.ratingrepository;
import com.example.rating.service.service.ratingserrvice;

@Service
public class ratingserviceimpl implements ratingserrvice{

	@Autowired
	private ratingrepository ratingrepo;
	
	
	@Override
	public rating created(rating rating) {
		String name=UUID.randomUUID().toString();
		rating.setRatingid(name);
	rating rat	=ratingrepo.save(rating);
		return rat;
	}

	@Override
	public List<rating> listallvaue() {
		List<rating> list=ratingrepo.findAll();
		return list;
	}

	@Override
	public List<rating> getvaluebysingleuserid(String userid) {
		List<rating>list=ratingrepo.findByUserid(userid);
		return list;
	}

	@Override
	public List<rating> getvaluebysinglehotelid(String hotelid) {
		List<rating>list=ratingrepo.findByHotelid(hotelid);
		return list;
	}

}
