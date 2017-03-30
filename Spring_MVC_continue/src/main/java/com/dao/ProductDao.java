package com.dao;

import java.util.List;

import com.proj.Product;

public interface ProductDao {

	void save(Product product);
	List<Product>findAll();
	Product findOne(String name);
	void delete(String name);
	
	Product findProductByType(String type);
	Product findProductByName(String name);
	
	Product findProductWithShop_plants(String name);
//	Product findProductByCountry(String country);
	
	
	
}
