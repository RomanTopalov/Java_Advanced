package com.proj;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Wallet {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name_wallet;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="wallet")
	private List<Product>products;
	
	
	
	
	public Wallet() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Wallet(String name_wallet) {
		super();
		this.name_wallet = name_wallet;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName_wallet() {
		return name_wallet;
	}
	public void setName_wallet(String name_wallet) {
		this.name_wallet = name_wallet;
	}
	
	
	@Override
	public String toString() {
		return "Wallet [id=" + id + ", name_wallet=" + name_wallet + ", products=" + products + "]";
	}
	
	
	

	
	
	
	
	
	
	
	
}
