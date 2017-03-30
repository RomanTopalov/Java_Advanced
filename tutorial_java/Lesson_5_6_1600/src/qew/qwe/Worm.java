package qew.qwe;

public /*abstract*/ class Worm extends Animal {

	boolean slur;

	public Worm(boolean brain, int eyes, int legs, boolean slur) {
		super(brain, eyes, legs);
		this.slur = slur;
	}

	@Override
	public String toString() {
		return "Worm - " + super.isBrain() + 
				" " + super.getEye() + " " + super.getLegs() + " " + this.slur;
	}
	
	@Override
	public void move() {
		System.out.println("I`m Worm, and i can move");
	}
	
	public void move(int speed){
		System.out.println("I`m Worm, and i can move with speed - " + speed);
		
	}
	

}
