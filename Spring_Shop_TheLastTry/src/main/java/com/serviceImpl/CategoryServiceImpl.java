package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CategoryDao;
import com.dao.ProductDao;
import com.entity.Category;
import com.entity.Product;
import com.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	@Autowired
	private ProductDao productDao;
	
	public void save(Category category) {
		categoryDao.save(category);
		
	}

	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

	public Category findOne(int id) {
		// TODO Auto-generated method stub
		return categoryDao.findOne(id);
	}

	public void delete(int id) {
		
		Category category = categoryDao.findCategoryWithProduct(id);
		for (Product product : category.getProducts()) {
			product.setCategory(null);
			productDao.save(product);
		}
		
		categoryDao.delete(id);
	}

	public void deleteProductFromCategory(String idProduct) {
		
		Product product = productDao.findOne(Integer.parseInt(idProduct));
		product.setCategory(null);
		productDao.save(product);
		
	}

	public List<Category> findCategoryWithProducts() {
		return categoryDao.findCategoryWithProduct();
	}

	public void saveAndFlush(Category category) {
		categoryDao.saveAndFlush(category);
		
	}

}
