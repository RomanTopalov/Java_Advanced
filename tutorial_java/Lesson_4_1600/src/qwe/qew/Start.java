package qwe.qew;

public class Start {

	public static void main(String[] tyuio) {
		hello("everybody");
		hello("serj");
		hello("roma");
		hello("khristina");
		calculon(123, 654);
		calculator(7, 9, "+");

		int[] asd = { 978, 489, 4, 94 };
		print(asd);

		qwerty(1, 2, 3, 4);
		
		normalCalultor("-", 100,5,5);

	}// ***********main ************

	public static void hello(String str) {
		System.out.println("hello " + str);
	}

	public static void calculon(int a, int b) {
		System.out.println(a + b);
	}

	public static void calculator(int a, int b, String action) {

		switch (action) {
		case "+":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println((double) a / b);
			break;
		default:
			break;
		}

	}

	public static void print(int[] xxx) {
		for (int i = 0; i < xxx.length; i++) {
			System.out.println(xxx[i]);
		}
	}

	public static void qwerty(int... a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result = result + a[i];
		}
		System.out.println(result);
	}

	public static void normalCalultor(String action, int... a) {

		int result = 0;
		switch (action) {
		case "+":
			for (int i = 0; i < a.length; i++) {
				result = result + a[i];
			}
			System.out.println(result);
			break;
		case "-":
			result = a[0];
			for (int i = 1; i < a.length; i++) {
				result = result - a[i];
			}
			System.out.println(result);
			break;
		case "*":
			result = 1;
			for (int i = 0; i < a.length; i++) {
				result = result * a[i];
			}
			System.out.println(result);
			break;
		case "/":
			result = 1;
			for (int i = 0; i < a.length; i++) {
				result = result / a[i];
			}
			break;

		default:
			break;
		}
	}

}// class
