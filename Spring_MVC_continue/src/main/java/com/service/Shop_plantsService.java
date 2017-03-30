package com.service;

import java.util.List;

import com.proj.Product;
import com.proj.Shop_plants;

public interface Shop_plantsService {

	void create(Shop_plants shop_plants);
	List<Shop_plants>findAll();
	Shop_plants findOne(int id);
	void delete(int id);
}
