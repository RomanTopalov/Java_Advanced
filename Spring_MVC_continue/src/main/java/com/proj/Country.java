package com.proj;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	private String nameCountry;
	
	@OneToMany(fetch =FetchType.LAZY,mappedBy="country")
	private List<Product>products;
	
	

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Country() {
		
	}

	public Country(String nameCountry) {
		super();
		this.nameCountry = nameCountry;
	}

	

	public String getNameCountry() {
		return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", nameCountry=" + nameCountry + ", products=" + products + "]";
	}


	
	
	
	
	
	
	
}
