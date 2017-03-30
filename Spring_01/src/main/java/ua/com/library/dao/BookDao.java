package ua.com.library.dao;


import java.util.List;

import ua.com.library.entity.Book;

public interface BookDao {

	
	 void create(Book book);
	 List<Book> getAll(); 
	 Book getOne (String title);	 
	 void delete(String title);
	 
}
