package com.arun.productapp.services;

import java.util.List;

import com.arun.productapp.models.Product;

public interface ProductService {
	
	public Product createProduct(Product product);
	public Product updateProduct(Product product);
	public List<Product> getProducts();
	public Product getOneProduct(Long id);
	public void deleteProduct(Long id);
	
}
