package com.example.Hotel.service.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Hotel")

public class Hotel {

	@Id
	private String id;
	
	private String name;
	
	private String location;
	
	private String about;
	
	@Transient
	private List<Rating> rating=new ArrayList();
	
	
	
}
