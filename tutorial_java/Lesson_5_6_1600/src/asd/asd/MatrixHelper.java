package asd.asd;

public class MatrixHelper {

	public static void add(Matrix one, Matrix two) {
		int lenght = one.getArr().length;
		int[] sum = new int[lenght];
		for (int i = 0; i < lenght; i++) {
			sum[i] = one.getArr()[i] + two.getArr()[i];
		}
		printMass(sum);
	}

	

	public static void multiply(Matrix a, Matrix b) {
		int lenght = a.getArr().length;
		int res[] = new int[lenght];
		for (int i = 0; i < res.length; i++) {
			res[i] = a.getArr()[i] * b.getArr()[i];

		}
		printMass(res);

	}
	
	private static void printMass(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}
}
