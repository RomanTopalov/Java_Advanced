package com.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Shop_plantsDao;
import com.proj.Product;
import com.proj.Shop_plants;
@Repository
public class Shop_plantsDaoImpl implements Shop_plantsDao {

	@PersistenceContext(unitName="Primary")
	private EntityManager entityManager;
	
	public Shop_plantsDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public EntityManager getEntityManager() {
		return entityManager;
	}


	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	public void save(Shop_plants shop_plants) {
		
		entityManager.persist(shop_plants);
	
		
		
	}

	@Transactional
	public List<Shop_plants> findAll() {
	
		return entityManager.createNamedQuery("findAllProduct").getResultList();
	}

	@Transactional
	public Shop_plants findOne(int id) {
		
		return (Shop_plants) entityManager.createQuery("findOne").getSingleResult();
	}

	@Transactional
	public void delete(int id) {
		entityManager.remove(id);
		
	}

	



	

	
	
}
