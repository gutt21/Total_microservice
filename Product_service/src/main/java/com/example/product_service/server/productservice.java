package com.example.product_service.server;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product_service.model.Product;
import com.example.product_service.repository.CustomRepository;

@Service
public class productservice {

	
	@Autowired
	private CustomRepository repository;
	
	
	
	
	
	public List<Product> getallvalues() {
		List<Product> findAll = repository.findAll();
		return findAll;
		
	}
	
	
	
	
	 public Product savedata(Product product) {
		Product save = repository.save(product);
		return save;
		
	}
	
	
	
	
	public Product getvaluebyid(int id) {
		Product findById = repository.findByid(id);
		return  findById;
	}
	
	
	
	
	
	
}
