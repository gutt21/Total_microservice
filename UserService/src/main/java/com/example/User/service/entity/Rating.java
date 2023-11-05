package com.example.User.service.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rating {

	private String ratingid;
	
	private String userid;
	
	private int rating;
	
	private String feedback;
	
	private String Hotelid;
	
	
	private Hotel hlist;
	
	
}
