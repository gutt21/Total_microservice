package com.example.product_service.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product_service.model.Product;
import com.example.product_service.server.productservice;

@RestController
@RequestMapping("/Product")
public class Controller {

	
	
	
	
	@Autowired
	private productservice productservice;
	
	
	
	
	
	@PostMapping("/save")
	public ResponseEntity<Product> createdsave(@RequestBody Product product){
		Product savedata = productservice.savedata(product);
		return ResponseEntity.ok(savedata);
		
		
	}
	
	
	@GetMapping("/Getdata/{id}")
	public ResponseEntity<Product> getvaluebyid(@PathVariable("id") int id){
		Product getvaluebyid = productservice.getvaluebyid(id);
		return ResponseEntity.ok(getvaluebyid);
	}
	
	
	
	
	
	
}
