package asd.asd;

import java.util.Random;

public class STart {
	public static void main(String[] args) {
		//                0   1   2
		int [] massive = {-1,18,-500};
		System.out.println(massive[2]);
		
		
		String arr [] = new String [3];
		
		arr[0] = "hello";
		arr[1] = "world";
		arr[2] = "!";
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		for(int i = 0; i<arr.length; i=i+1){
			System.out.println("element " + i + " - " + arr[i]);
		}
		
		System.out.println(arr.length);
		
		int count = 0;
		while(count<10){
			System.out.println("test");
			count++; // count = count+1;
		}
		
		do {
			System.out.println("do wile");
		} while (false);
		
		Random r = new Random();
		System.out.println( r.nextInt(50) );
		
		int xxx [] = new int [100];
		
		for (int i = 0; i < xxx.length; i++) {
			xxx[i] = r.nextInt(50);
			System.out.print(xxx[i] + " ");
			if(i%5 == 0){
				System.out.println();
			}
		}
		
		int [] asd = new int [50];
		
		
		
	}
}
