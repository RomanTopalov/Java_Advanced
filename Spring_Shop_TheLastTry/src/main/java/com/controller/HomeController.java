package com.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.editor.ProductEditor;
import com.entity.Product;
import com.service.ProductService;


@Controller
public class HomeController {
	@Autowired
	private ProductService productService;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Product.class, new ProductEditor(productService));
	}

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String home(Model model, Principal principal) {
		model.addAttribute("products", productService.findAll());
		return "views-base-home";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String loginprocesing() {
		return "redirect:/home";
	}

	@RequestMapping("/loginpage")
	public String login() {
		return "views-base-loginpage";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout() {

		return "redirect:/";
	}


}
