package ua.com.library.entity;

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
	 @OneToMany(fetch=FetchType.LAZY,mappedBy="Shop_plants")
	 private List<Product>products;
	 @OneToMany(fetch=FetchType.LAZY,mappedBy="Shop_plants")
	 private List<Users> users;
	 @OneToMany(fetch=FetchType.LAZY,mappedBy="shop_plants")
	 private List<Articles>articles;
	 
	 

	public Shop_plants() {
	
	}

	public Shop_plants(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
