package ua.com.library.daoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.com.library.dao.BookDao;
import ua.com.library.entity.Book;
@Repository
public class BookDaoImpl implements BookDao{
	
	@PersistenceContext(unitName="Primary")
	private EntityManager entityManager;
	
	@Transactional
	public void create(Book book) {
		entityManager.persist(book);
	}

	@Transactional
	public List<Book> getAll() {
		return entityManager.createQuery("from Book").getResultList();
	}
	
	@Transactional
	public Book getOne(String title) {
		return (Book) entityManager.createQuery
				("select b from Book b where title like :title")
				.setParameter("title", title).getSingleResult();
	}
	
	@Transactional
	public void delete(String title) {
		entityManager.remove(getOne(title));
		
	}

	
	
}