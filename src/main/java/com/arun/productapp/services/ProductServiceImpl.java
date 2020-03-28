package com.arun.productapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.productapp.models.Product;
import com.arun.productapp.repos.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product createProduct(Product product) {
		
		Product createdProduct = productRepository.save(product);
		
		return createdProduct;
	}

	@Override
	public Product updateProduct(Product product) {
		
		Product updatedProduct = productRepository.save(product);
		
		return updatedProduct;
	}

	@Override
	public List<Product> getProducts() {
		
		List<Product> products = productRepository.findAll();
		return products;
	}

	@Override
	public Product getOneProduct(Long id) {
		Optional<Product> findById = productRepository.findById(id);
		Product oneProduct = findById.get();
		return oneProduct;
	}

	@Override
	public void deleteProduct(Long id) {
		
		productRepository.deleteById(id);
	}

}
