package com.proj;




import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shop_plants {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 private String name ;
	 @OneToMany(fetch=FetchType.LAZY,mappedBy="shop_plants")
	 private List<Product> products;
	 
	 @OneToMany(fetch=FetchType.LAZY,mappedBy="shop_plants")
	 private List<Users> users;
	
	 @OneToMany(fetch=FetchType.LAZY,mappedBy="shop_plants")
	 private List<Article>article;
	 
	 

	public Shop_plants() {
	
	}

	public Shop_plants( String name) {
		super();
		
		this.name = name;
	}

	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shop_plants [id=" + id + ", name=" + name + "]";
	}
	
	

}
