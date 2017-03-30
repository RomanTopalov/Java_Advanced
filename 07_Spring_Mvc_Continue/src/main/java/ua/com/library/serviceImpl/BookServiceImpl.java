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
		// TODO Auto-generated method stub
		return null;
	}

	public Book getOne(String Title) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String title) {
		// TODO Auto-generated method stub
		
	}

}
