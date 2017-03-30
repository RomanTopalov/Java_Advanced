package pack_01;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class People {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String surName;
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="people_city",joinColumns=@JoinColumn(name="id_people"),
	inverseJoinColumns=@JoinColumn(name="id_city"))
	private List<T>cities;
 People() {
	
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
public List<T> getCities() {
	return cities;
}
public void setCities(List<T> cities) {
	this.cities = cities;
}
@Override
public String toString() {
	return "People [id=" + id + ", name=" + name + ", surName=" + surName + ", cities=" + cities + "]";
}
 
	
	
	
}
