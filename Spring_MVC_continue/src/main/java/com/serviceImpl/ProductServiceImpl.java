package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDao;
import com.proj.Product;
import com.service.ProductService;
@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	public void create(Product product) {
		productDao.save(product);
		
	}

	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	public Product findOne(String name) {
		return productDao.findOne(name);
		
	}

	public void delete(String name) {
		productDao.delete(name);
		
	}

	public Product findProductWithShop_plants(String name) {
		return productDao.findProductWithShop_plants(name);
	}

	public void findProductByName(String name) {
		productDao.findProductByName(name);
		
	}

	public void findProductByType(String type) {
		// TODO Auto-generated method stub
		productDao.findProductByType(type);
	}



	
}
