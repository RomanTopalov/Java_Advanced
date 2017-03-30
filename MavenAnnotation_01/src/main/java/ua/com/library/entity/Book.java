package ua.com.library.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)   //автоінкремент
	private int id;
	private String title;
	private int page;
	private String yearOfPublic;
	 
	
	public Book() {
		
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getYearOfPublic() {
		return yearOfPublic;
	}
	public void setYearOfPublic(String yearOfPublic) {
		this.yearOfPublic = yearOfPublic;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", page=" + page + ", yearOfPublic=" + yearOfPublic + "]";
	}
	
	
	
	}
