package com.example.rating.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "micro-rating")
public class rating {

	@Id
	@Column(name = "id")
	private String ratingid;
	
	private String userid;
	
	private String hotelid;
	
	private int	 rating;
	
	private String feedback;
	
	
	
}
