package com.arun.productapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arun.productapp.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
