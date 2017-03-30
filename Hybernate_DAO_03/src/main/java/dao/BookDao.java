package dao;

import java.util.List;

import entity.Book;

public interface BookDao {
	void save(Book book);
	List<Book> findAll();
	Book findOne(int id);
	void delete(int id); 
	Book findByName(String name);
}
