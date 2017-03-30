package ua.com.library.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surName;
	private int numberTel;
	private String describes;
	@ManyToOne(fetch=FetchType.LAZY)
	private Shop_plants shop_plants;
	

	public Users() {

	}

	public Users(int id, String name, String surName, int numberTel, String describes) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.numberTel = numberTel;
		this.describes = describes;
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

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getNumberTel() {
		return numberTel;
	}

	public void setNumberTel(int numberTel) {
		this.numberTel = numberTel;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", surName=" + surName + ", numberTel=" + numberTel
				+ ", describes=" + describes + "]";
	}

}





