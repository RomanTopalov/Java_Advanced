package ua.com.library.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Variety_product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Brush brush;
	private Trees trees;
	private Flowers flowers;
	private Seed seed;
/*	@OneToOne()
	private */

	public Variety_product() {

	}

	public Variety_product(int id, Brush brush, Trees trees, Flowers flowers, Seed seed) {
		super();
		this.id = id;
		this.brush = brush;
		this.trees = trees;
		this.flowers = flowers;
		this.seed = seed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Brush getBrush() {
		return brush;
	}

	public void setBrush(Brush brush) {
		this.brush = brush;
	}

	public Trees getTrees() {
		return trees;
	}

	public void setTrees(Trees trees) {
		this.trees = trees;
	}

	public Flowers getFlowers() {
		return flowers;
	}

	public void setFlowers(Flowers flowers) {
		this.flowers = flowers;
	}

	public Seed getSeed() {
		return seed;
	}

	public void setSeed(Seed seed) {
		this.seed = seed;
	}

	@Override
	public String toString() {
		return "Variety_product [id=" + id + ", brush=" + brush + ", trees=" + trees + ", flowers=" + flowers
				+ ", seed=" + seed + "]";
	}

	
}
