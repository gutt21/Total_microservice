package com.example.product_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.product_service.model.Product;

public interface CustomRepository extends JpaRepository<Product, Integer> {

	
	Product findByid(int id);
	
	
}
