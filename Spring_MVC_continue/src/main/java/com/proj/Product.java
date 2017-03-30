package com.proj;
import javax.persistence.Entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries({
	@NamedQuery(name = "findOne", query = "select a from Product a where a.name like :name"),
	@NamedQuery(name = "findProductByType", query = "select b from Product b where b.type like :type"),
	@NamedQuery(name = "findProductByName", query = "select a from Product a where a.name like :name")

})
//@NamedQuery(name = "findProductByCountry", query = "select c from Product c where c.country like :country")
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private String name;
	private int count;
	private int price;
	private String describe_product;

	@ManyToOne(fetch = FetchType.LAZY)
	private Shop_plants shop_plants;

	@ManyToOne(fetch = FetchType.LAZY)
	private Country country;
	
	@ManyToOne(fetch=FetchType.LAZY)
 private Wallet wallet;
	

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String type, String name, int count, int price, String describe_product) {
		super();

		this.type = type;
		this.name = name;
		this.count = count;
		this.price = price;
		this.describe_product = describe_product;

	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Shop_plants getShop_plants() {
		return shop_plants;
	}

	public void setShop_plants(Shop_plants shop_plants) {
		this.shop_plants = shop_plants;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", type=" + type + ", name=" + name + ", count = " + count + ", + price=" + price
				+ ", describe_product=" + describe_product + " ]";
	}

}
