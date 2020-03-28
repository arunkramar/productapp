package com.arun.productapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.arun.productapp.models.Product;
import com.arun.productapp.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	ProductService prodService;
	
	
	@GetMapping("/display")
	public String displayProducts(ModelMap modelMap){
		List<Product> products = prodService.getProducts();
		modelMap.addAttribute("products", products);
		return "displayProducts";
	}
	
	@GetMapping("/addProduct")
	public String addProduct() {
		
		return "addProduct";
	}
	
	@PostMapping("/create")
	public String createProduct(@ModelAttribute("product") Product product, ModelMap modelMap) {
		prodService.createProduct(product);
		List<Product> products = prodService.getProducts();
		modelMap.addAttribute("products", products);
		return "displayProducts";
		
	}
	
	
	

}
