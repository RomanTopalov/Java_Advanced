package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Shop_plantsDao;

import com.proj.Shop_plants;
import com.service.Shop_plantsService;

@Service("shop_plantsService")
public class Shop_plantsServiceImpl implements Shop_plantsService{

	@Autowired
	private Shop_plantsDao shop_plantsDao;
	
	public void create(Shop_plants shop_plants) {
		shop_plantsDao.save(shop_plants);
	}

	public List<Shop_plants> findAll() {
		return shop_plantsDao.findAll();
	}

	public Shop_plants findOne(int id) {
		return shop_plantsDao.findOne(id);
	}

	public void delete(int id) {
		shop_plantsDao.delete(id);
		
	}

///// переписати query
//	public Shop_plants findProductByName(String name) {
//		
//		return shop_plantsDao.findProductByName(name);
//	}

}
