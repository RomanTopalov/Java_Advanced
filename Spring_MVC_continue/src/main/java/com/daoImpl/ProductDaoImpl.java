package com.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ProductDao;
import com.proj.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	
	@PersistenceContext(unitName="Primary")
	private EntityManager entityManager;
	
	@Transactional
	public void save(Product product) {
	
		entityManager.persist(product);
	
		
	}
	@Transactional
	public List<Product> findAll() {
		
		return entityManager.createNamedQuery("findAllProduct").getResultList();
	}
	@Transactional
	public Product findOne(String name) {
		// TODO Auto-generated method stub
		return (Product) entityManager.createNamedQuery("findOne").setParameter("name", name).getSingleResult();
	}
	@Transactional
	public void delete(String name) {
	entityManager.remove(name);;
		
	}
	@Transactional
	public Product findProductByType(String type) {
		// TODO Auto-generated method stub
		return (Product) entityManager.createNamedQuery("findProductByType").
				setParameter("type", type).getSingleResult();
	}
	@Transactional
	public Product findProductByName(String name) {
		
		return (Product) entityManager.createNamedQuery("findProductByName").
				setParameter("name", name).getSingleResult();
	}
	@Transactional
	public Product findProductWithShop_plants(String name) {
		
		 return (Product) entityManager.createQuery("select p from Product p left join fetch p.shop_plants s where p.name like: name").setParameter("name", name).getSingleResult();
	}

	
}
