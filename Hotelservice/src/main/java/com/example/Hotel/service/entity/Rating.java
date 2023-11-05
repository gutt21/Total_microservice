package com.example.Hotel.service.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {
	
	
	private String ratingid;
	
	private String userid;
	
	private String hotelid;
	
	private int	 rating;
	
	private String feedback;
}
