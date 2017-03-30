package ads.ads;

import java.util.Scanner;

public class Start {
	public static void main(String[] args) {

		String s1 = "hello!";
		String s2 = "world!";

		// boolean bl = s1 == s2;
		boolean bl = s1.equalsIgnoreCase(s2);
		System.out.println(bl);

		if (s1.equals("hello!!!")) {
			System.out.println("true");
		} else if (s1.equals("hello!!")) {
			System.out.println("first else if");
		} else if (s1.equals("hello!")) {
			System.out.println("seond else if");
		} else {
			System.out.println("else");
		}

		// true false = false
		if (s1.equals("hello!") && s2.equals("world")) {
			System.out.println("all is equals");
			// true false = true
		} else if (s1.equals("hello!") || s2.equals("test")) {
			System.out.println("some string is equals");
		} else if ((s1.equals("hello!") && s2.equals("world")) && (s1.equals("hello!") || s2.equals("test"))) {

		}

		int x = 786;
		if (x % 2 == 0) {
			System.out.println("parne");

			if (x % 3 == 0) {
				System.out.println("kratne 3");
			}
		}

		if (true)
			System.out.println("asd");

		int b = 5 < 4 ? 5 : 10;
		System.out.println(b);

		switch (654) {
		case 166:
			System.out.println("case 1");
			break;
		case 65498:
			System.out.println("case 2");
			break;
		default :
				System.out.println("default");
		}
		
		
		Scanner xxx = new Scanner(System.in);
//		int i = xxx.nextInt();
		System.out.println("починайте введення");
		String str = xxx.nextLine();
		
		if("hello".equals(str)){
			System.out.println("eq");
		}
	}
}













