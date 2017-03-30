package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.entity.Product;
import com.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired
	private ProductDao productDao;
	
	public void save(Product product) {
	productDao.save(product);
		
	}

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	public Product findOne(int id) {
		// TODO Auto-generated method stub
		return productDao.findOne(id);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		productDao.delete(id);
	}

}
