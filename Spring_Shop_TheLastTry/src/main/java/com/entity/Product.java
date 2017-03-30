package com.entity;
import java.util.List;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;



@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int count;
	private int price;
	private String describe_product;

	@ManyToOne
	private Country country;
	
	@ManyToOne
	private Category category;
	
	@ManyToMany
	@JoinTable(name = "user_product", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> users;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, int count, int price, String describe_product) {
		super();
		this.id = id;
		this.name = name;
		this.count = count;
		this.price = price;
		this.describe_product = describe_product;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescribe_product() {
		return describe_product;
	}

	public void setDescribe_product(String describe_product) {
		this.describe_product = describe_product;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", count=" + count + ", price=" + price + ", describe_product="
				+ describe_product + ", country=" + country + ", category=" + category + ", users=" + users + "]";
	}
	
	
	

	
	
	

	
	

}
