package com.dto;

import java.util.ArrayList;
import java.util.List;

import com.entity.Article;
import com.entity.Category;
import com.entity.City;
import com.entity.Country;
import com.entity.Product;
import com.entity.User;

public class DtoUtilMapper {
	
	public static List<UserDTO> usersToUsersDTO(List<User> users) {

		List<UserDTO> userDTOs = new ArrayList<UserDTO>();

		for (User user : users) {

			UserDTO userDTO = new UserDTO();
			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setEmail(user.getEmail());

			userDTOs.add(userDTO);

		}

		return userDTOs;

	}

	public static List<ProductDTO> productsToProductsDTO(List<Product> products) {

		List<ProductDTO> productDTOs = new ArrayList<ProductDTO>();

		for (Product product : products) {
			ProductDTO productDTO = new ProductDTO();

			productDTO.setName(product.getName());
			productDTO.setPrice(product.getPrice());

			productDTOs.add(productDTO);

		}

		return productDTOs;

	}
	
	
	public static List<CategoryDTO> categoriesToCategoriesDTOs(List<Category> categories){
		
		List<CategoryDTO> categoryDTOs = new ArrayList<CategoryDTO>();
		
		for(Category category : categories){
			categoryDTOs.add(new CategoryDTO(category.getId(), category.getName()));
		}
		
		return categoryDTOs;
	
	}
	
	
	public static List<CountryDTO> countriesToCountriesDTOs(List<Country> countries){
		
		List<CountryDTO> countryDTOs = new ArrayList<CountryDTO>();
		
		for(Country country : countries){
			countryDTOs.add(new CountryDTO(country.getId(), country.getName()));
		}
		return countryDTOs;
	}

	public static List<CityDTO> cityToCityDTO(List<City> cities){

		List<CityDTO> cityDTOs = new ArrayList<CityDTO>();

		for (City city : cities) {
			cityDTOs.add(new CityDTO(city.getName()));
		}

		return cityDTOs;

	}
	
	public static List<ArticleDTO> articleToArticleDTO(List<Article> articles){

		List<ArticleDTO> articleDTOs = new ArrayList<ArticleDTO>();

		for (Article article:articles) {
			articleDTOs.add(new ArticleDTO(article.getId(),article.getName()));
		}

		return articleDTOs;

	}
}
