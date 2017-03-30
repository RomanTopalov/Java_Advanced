package pack_02_dao;

import java.util.List;

import javax.persistence.EntityManager;

import pack_01.T;
import pack_01.Country;

public class CityDaoImp implements CityDao{
	
	private EntityManager entityManager;
	
	

	public CityDaoImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void save(T city) {
	entityManager.getTransaction().begin();
	entityManager.persist(city);
	entityManager.getTransaction().commit();
		
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from City").getResultList(); //select smth from book
	}

	public T findOneByname(String name) {
		
		return (T) entityManager.createNamedQuery("findByName").setParameter("name", name).getSingleResult();
	}

	public void delete(String name) {
		entityManager.getTransaction().begin();
		
		T city = (T) entityManager.createNamedQuery("findByName").setParameter("name", name).getSingleResult();
		entityManager.remove(city);
		entityManager.getTransaction().commit();
		
	}


}
