package com.arun.productapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arun.productapp.models.Product;
import com.arun.productapp.services.ProductService;

@RestController
@RequestMapping(value="/products")
public class ProductRestController {
	
	
	@Autowired
	ProductService prodService;
	
	@GetMapping("/")
	public List<Product> displayProducts(){
		List<Product> products = prodService.getProducts();
		return products;
	}
	
	@PostMapping("/")
	public void createProduct(@RequestBody Product product) {
		
		prodService.createProduct(product);
	}
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		
		return prodService.getOneProduct(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable("id") Long id){
				prodService.deleteProduct(id);
	}
	
	

}
