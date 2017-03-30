package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.Country;


public interface CountryService {
	void save(Country country);

	List<Country> findAll();

	Country findOne(int id);

	void delete(int id);

	Country findCountryWithCities(int id);
}
