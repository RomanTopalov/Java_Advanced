package com.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CountryDao;
import com.proj.Country;
import com.proj.Product;
@Repository
public class CountryDaoImpl implements CountryDao{

	@PersistenceContext(unitName="Primary")
	private EntityManager entityManager;
	@Transactional
	public void save(Country country) {
		// TODO Auto-generated method stub
		entityManager.persist(country);
	}
	@Transactional
	public List<Country> findAll() {
		return entityManager.createNamedQuery("findAllCountry").getResultList();
	}
	@Transactional
	public Country findOne(String nameCountry) {
		return (Country) entityManager.createQuery("findOneCountry").getSingleResult();
	}
	@Transactional
	public void delete(String nameCountry) {
		entityManager.remove(nameCountry);

		
	}

}
