package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CountryDao;
import com.proj.Country;
import com.service.CountryService;
@Service("countryService")
public class CountryServiceImpl implements CountryService{

	@Autowired
	private CountryDao countryDao;
	public void create(Country country) {
	countryDao.save(country);
		
	}

	public List<Country> findAll() {
		// TODO Auto-generated method stub
		return countryDao.findAll();
	}

	public Country findOne(String nameCountry) {
		// TODO Auto-generated method stub
		return countryDao.findOne(nameCountry);
	}

	public void delete(String nameCountry) {
		countryDao.delete(nameCountry);
		
	}

}
