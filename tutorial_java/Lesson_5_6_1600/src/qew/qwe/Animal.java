package qew.qwe;

public /*final*/ abstract class Animal {
	private boolean brain;
	private int eye;
	private int legs;

	public Animal() {
	}

	public Animal(boolean brain, int eye, int legs) {
		this.brain = brain;
		this.eye = eye;
		this.legs = legs;
	}

	public boolean isBrain() {
		return brain;
	}

	public void setBrain(boolean brain) {
		this.brain = brain;
	}

	public int getEye() {
		return eye;
	}

	public void setEye(int eye) {
		this.eye = eye;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	@Override
	public String toString() {
		return "Animal [brain=" + brain + ", eye=" + eye + ", legs=" + legs + "]";
	}
	
	public /*final*/ abstract void move();

	
	

}
