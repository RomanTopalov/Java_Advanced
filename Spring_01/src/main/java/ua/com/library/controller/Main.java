package ua.com.library.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.com.library.entity.Book;
import ua.com.library.service.BookService;

public class Main {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("appContext.xml"); 
		
		
 BookService bookService = (BookService) context.getBean("bookService");
		
		
		bookService.save(new Book("JAVA", 1000));
		
		
		context.close();
	}
	
}