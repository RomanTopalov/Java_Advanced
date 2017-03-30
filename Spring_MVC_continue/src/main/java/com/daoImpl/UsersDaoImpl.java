package com.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UsersDao;
import com.proj.Product;
import com.proj.Users;
@Repository
public class UsersDaoImpl implements UsersDao {

	@PersistenceContext(unitName="Primary")
	private EntityManager entityManager;
	@Transactional
	public void save(Users users) {
		entityManager.persist(users);
		
	}
	@Transactional
	public List<Users> findAll() {

		return entityManager.createNamedQuery("findAllUsers").getResultList();
	}
	@Transactional
	public Users findOne(String name) {
		return  (Users) entityManager.createQuery("findOneUser").getSingleResult();
	}
	@Transactional
	public void delete(String name) {
		entityManager.remove(name);;
		
	}

}
