package asd.asd;

import java.util.Scanner;

public class Start {
	static int rakhunok = 500000;
	public static String scannerString(){
		System.out.println("Begin...");
		return new Scanner(System.in).nextLine();
	}
	
	public static void fillPhone(){
		System.out.println("Введіть номер в форматі +38 ххх ххх хх хх");
		String phone = scannerString();
		if(phone.length()!=13 || !phone.startsWith("+")){
			System.out.println("Телефон введено невірно");
		}else{
			System.out.println("Введіть сумму поповнення");
			getMoney();
		}
		
	}
	
	public static void setMoney(){
		int i = scannerInt();
		rakhunok = rakhunok  +  Math.abs(i);
	}
	
	public static void getMoney(){
		int i = Math.abs(scannerInt());
		if(rakhunok>i){
			rakhunok = rakhunok - i;
		}
	}
	
	public static int scannerInt(){
		System.out.println("Enter a number");
		return new Scanner(System.in).nextInt();
	}
	
	public static void menu(){
		while (true) {
			switch (scannerInt()) {
			case 1:
				System.out.println(rakhunok);
				break;
			case 2:
				getMoney();
				System.out.println(rakhunok);
				break;
			case 3:
				setMoney();
				System.out.println(rakhunok);
				break;
			case 4:
				fillPhone();
				System.out.println(rakhunok);
				break;
			case 5:
				System.out.println("faq");
				return;

			default:
				System.out.println("немає такого значення");
				return;
			}
			
		}
	}
	public static void main(String[] args) {
		
		menu();
		
		
	}//*******************
	
	

}
