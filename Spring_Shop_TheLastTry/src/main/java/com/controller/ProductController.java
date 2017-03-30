package com.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.DtoUtilMapper;
import com.editor.CategoryEditor;
import com.editor.CountryEditor;
import com.entity.Category;
import com.entity.Country;
import com.entity.Product;
import com.service.CategoryService;
import com.service.CountryService;
import com.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private CategoryService categoryService;

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Country.class, new CountryEditor(countryService));
		binder.registerCustomEditor(Category.class, new CategoryEditor(categoryService));
	}

	@RequestMapping(value = "/newProduct", method = RequestMethod.GET)
	public String newProduct(Model model) {

		model.addAttribute("products", productService.findAll());
		model.addAttribute("product", new Product());
		model.addAttribute("countriesDTOs", DtoUtilMapper.countriesToCountriesDTOs(countryService.findAll()));
		model.addAttribute("categoriesDTOs", DtoUtilMapper.categoriesToCategoriesDTOs(categoryService.findAll()));
		return "views-admin-newProduct";
	}

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute Product product, @RequestParam String count, @RequestParam String price) {

		product.setCount(Integer.parseInt(count));

		product.setPrice(Integer.parseInt(price));

		productService.save(product);

		return "redirect:/newProduct";
	}

	@RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.GET)
	public String newProduct(@PathVariable int id) {

		productService.delete(id);

		return "redirect:/newProduct";
	}

}
