package ua.com.library.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
	//private Variety_product product;
	@ManyToOne(fetch=FetchType.LAZY)
	private Shop_plants shop_plants;
	
	public Product() {

	}

	public Product(int id, Variety_product product) {
		super();
		this.id = id;
		//this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public Variety_product getProduct() {
		return product;
	}

	public void setProduct(Variety_product product) {
		this.product = product;
	}*/

	@Override
	public String toString() {
		return "Product [id=" + id + /*", product=" + product +*/ "]";
	}

	
	

}
