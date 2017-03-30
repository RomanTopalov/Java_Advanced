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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
@NamedQuery(name="findByName" , query="select b from City b where b.name like:name")
@Entity
public class T {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int population;
	
	private String name ;
	@ManyToOne(fetch=FetchType.LAZY)
	private Country country; // створюэмо обэкт щоб повязати country i city
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="people_city",joinColumns=@JoinColumn(name="id_city"),
	inverseJoinColumns=@JoinColumn(name="id_people"))
	private List<People>peoples;
	
	
	public T() {
		// TODO Auto-generated constructor stub
	}

	

	public T(int population, String name) {
		super();
		
		this.population = population;
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

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}



	@Override
	public String toString() {
		return "City [id=" + id + ", population=" + population + ", name=" + name + ", country=" + country
				+ ", peoples=" + peoples + "]";
	}

	
	
	
	
}
