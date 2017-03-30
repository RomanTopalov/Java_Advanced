package com.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
@RequestMapping(value="/",method=RequestMethod.GET)
	public String home(Model model){
	model.addAttribute("max", Integer.MAX_VALUE);
		return "home";
	}

@RequestMapping(value="/*",method=RequestMethod.GET)
public String link(@RequestParam String someInput){

	System.out.println(someInput);
	return "redirect:/";
}

@RequestMapping(value="/saveUser",method=RequestMethod.GET)
public String saveUser(@RequestParam String username,@RequestParam String email,@RequestParam String password,Model model){

	User user = new User(username, email, password);
	model.addAttribute("u",user);
	return "home";
}

}
