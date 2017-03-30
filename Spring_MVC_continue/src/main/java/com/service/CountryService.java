package com.service;

import java.util.List;

import com.proj.Country;

public interface CountryService {

	void create(Country country);
	List<Country>findAll();
	Country findOne(String nameCountry);
	void delete(String nameCountry);
}
