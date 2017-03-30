package pack_01;

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
	private String name;
	private int population;
@OneToMany(fetch=FetchType.LAZY,mappedBy="country")
	private List<T> city;
	
	
	
	Country(){
		
	}
	
	

	public Country(String name, int population) {
		super();
		
		this.name = name;
		this.population = population;
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
		return "Country [id=" + id + ", name=" + name + ", population=" + population + "]";
	}
	
	
	
}
