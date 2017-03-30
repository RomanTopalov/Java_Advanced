package pack_03_daoImp;

import java.util.List;

import javax.persistence.EntityManager;

import pack_01.T;
import pack_01.Country;

public class CountryDaoImp CountryDao<T>  {
	
	private EntityManager entityManager;
	
	

	public DaoImp(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void save1(T t) {
	entityManager.getTransaction().begin();
	entityManager.persist(t);
	entityManager.getTransaction().commit();
		
	}

	public List<T> findAll() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from City").getResultList(); //select smth from book
	}

	public T findOneByname1(String name) {
		
		return (T) entityManager.createNamedQuery("findByName").setParameter("name", name).getSingleResult();
	}

	public void delete(String name) {
		entityManager.getTransaction().begin();
		
		T city = (T) entityManager.createNamedQuery("findByName").setParameter("name", name).getSingleResult();
		entityManager.remove(t);
		entityManager.getTransaction().commit();
		
	}

	public void save(T t) {
		// TODO Auto-generated method stub
		
	}

	public T findOneByname(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
