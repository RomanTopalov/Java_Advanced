package ua.com.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ua.com.library.dao.BookDao;
import ua.com.library.entity.Book;
import ua.com.library.service.BookService;
@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	
	public void save(Book book) {
		bookDao.create(book);
	}

	public List<Book> getAll() {
	 
		return bookDao.getAll();
	}

	public Book getOne(String title) {
		return bookDao.getOne(title);
	}

	public void delete(String title) {
		bookDao.delete(title);
	}

}