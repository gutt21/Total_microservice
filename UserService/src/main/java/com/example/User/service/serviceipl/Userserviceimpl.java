package com.example.User.service.serviceipl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.User.service.entity.Hotel;
import com.example.User.service.entity.Rating;
import com.example.User.service.entity.User;
import com.example.User.service.exception.ResourceNotFoundException;
import com.example.User.service.exteenal.service.HotelService;
import com.example.User.service.exteenal.service.RatingService;
import com.example.User.service.repository.Userrepository;
import com.example.User.service.service.UserService;

@Service
public class Userserviceimpl implements UserService {

	
	@Autowired
	private Userrepository userrepo;
	
	@Autowired
	private RestTemplate resttemple;
	
	@Autowired
	private HotelService hoteservice;
	
	@Autowired
	private RatingService ratingservice;
	
	private Logger logger=LoggerFactory.getLogger(Userserviceimpl.class);
	
	
	@Override
	public User usersave(User user) {
		String id=UUID.randomUUID().toString();
		user.setUserid(id);
		User user1=userrepo.save(user);
		return user1;
	}

	
	
	
	@Override
	public List<User> getAlluser() {
		  List<User> user = userrepo.findAll();
		   List<User> collect = user.stream().map(user1->{
			Rating[] getallratings = ratingservice.getallratingbyusinguserid(user1.getUserid());
			user1.setRatings(Arrays.asList(getallratings));
			return user1;
		    }).collect(Collectors.toList());
		return collect;
	}

	
	
	
	
	 @Override
	 public User getuserid(String id) {
	     User user=userrepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("User has given id is not found on server !! "+id));
	     
	     //using resttemple 
	     //  Rating[] forobject=resttemple.getForObject("http://RATING-SERVICE/ratings/users/"+user.getUserid(), Rating[].class);
	      
	      //usingt feign client
	      Rating[] getallratingbyusinguserid = ratingservice.getallratingbyusinguserid(user.getUserid());
	      
	      
	      logger.info("{}",getallratingbyusinguserid.toString());
	      List<Rating>list1  = Arrays.stream(getallratingbyusinguserid).toList();
	      List<Rating> collect = list1.stream().map(rating -> {
	    	  
	    	  //using rest tesmple
	    	  //ResponseEntity<Hotel> forObject2 =resttemple.getForEntity("http://HOTEL-SERVICE/hotels/"+rating.getHotelid(), Hotel.class);
	    	  //Hotel body = forObject2.getBody();
             
	    	  //useing feign client 
	    	  Hotel body=hoteservice.getvalueusingbyid(rating.getHotelid());
	    	  rating.setHlist(body);
	    	  return rating;
	    	  
	      }).collect(Collectors.toList());
	       user.setRatings(collect);
	      return user;
	}

}
