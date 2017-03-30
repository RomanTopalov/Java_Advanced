package pack_main_01;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pack_01.T;

import pack_02_dao.CityDao;
import pack_02_dao.CityDaoImp;

public class Main {
	
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Primary");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	CityDao bookDao = new CityDaoImp(entityManager);
	//bookDao.save(new City(1000, "erwdf"));
	//bookDao.save(new City(1230, "Rivte"));
	//System.out.println(bookDao.findAll());
	//System.out.println(bookDao.findOneByname("Rivte"));
	
	
	bookDao.delete("Rivte");
	
	entityManager.close();
	entityManagerFactory.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	entityManager.getTransaction().begin();
	
	
	
//	entityManager.persist(new City(4564, "lviv"));
//	entityManager.persist(new City(110,"Kyiv"));
//	entityManager.persist(new City(13103,"Rivne"));
	

//	List<City> cities = entityManager.createQuery("dfsdf").getResultList();

	
//	entityManager.getTransaction().commit();
//	entityManager.close();
//	entityManagerFactory.close();
//	
	}
}
