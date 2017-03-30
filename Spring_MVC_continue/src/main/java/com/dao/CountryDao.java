package com.dao;

import java.util.List;


import com.proj.Country;

public interface CountryDao {
	void save(Country country);
	List<Country>findAll();
	Country findOne(String nameCountry);
	void delete(String nameCountry);
}
