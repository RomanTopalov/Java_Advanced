package asd.asd;

public class Main {
	public static void main(String[] args) {
		Matrix a = new Matrix(10, 50);
		
		Matrix b = new Matrix(Matrix.randomizer(10, 50));
		System.out.println(a);
		System.out.println(b);
		MatrixHelper.add(a, b);
	}
}
