package com.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proj.Product;
import com.proj.Shop_plants;
import com.proj.Users;
import com.service.ProductService;
import com.service.Shop_plantsService;
import com.service.UsersService;


public class Main {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("appContext.xml"); 
		
 ProductService  productService =(ProductService) context.getBean("productService");
 //System.out.println(productService.findOne("roze"));
	//	productService.create(new Product("tree", "Dub", 10, 12, "big"));
	//productService.create(new Product("flower", "bibka", 20, 12, "height"));
//productService.delete("bibka");
 UsersService usersService = (UsersService) context.getBean("usersService");
 //usersService.create(new Users("Roma", "Topalov", 447334, "programmer"));
 



		//Shop_plantsService shop_plantsService = (Shop_plantsService) context.getBean("shop_plantsService");
		//shop_plantsService.create(new Shop_plants("Gardener"));
		
	//Shop_plants shop_plants = (Shop_plants) context.getBean("shop_plantsService");
		
		context.close();
	}
	
}