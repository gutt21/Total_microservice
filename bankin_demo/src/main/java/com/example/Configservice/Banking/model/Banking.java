package com.example.Configservice.Banking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

@Entity
@Table(name = "Banking")
public class Banking {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String IFSCcode;
	
	private String bankname;
	
	private String branch;
	
	private String feedback;
	
	
	
	
}
