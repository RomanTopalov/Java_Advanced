package ua.com.library.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Primary");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	entityManager.getTransaction().begin();
	
	entityManager.getTransaction().commit();
	entityManager.close();
	entityManagerFactory.close();
}
}
