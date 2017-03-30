package com.service;

import java.util.List;

import com.proj.Product;

public interface ProductService {

	void create(Product product);
	List<Product>findAll();
	Product findOne(String name);
	void delete(String name);
	
	void findProductByName(String name);
	void findProductByType(String type);
	
	public Product findProductWithShop_plants(String name); 
}
