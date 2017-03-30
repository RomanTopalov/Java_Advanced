package com.dao;

import java.util.List;

import com.proj.Shop_plants;


public interface Shop_plantsDao {

	void save(Shop_plants shop_plants);
	List<Shop_plants>findAll();
	Shop_plants findOne(int id);
	void delete(int id);
	
}
