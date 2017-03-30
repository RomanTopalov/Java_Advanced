package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CountryDTO;
import com.dto.DtoUtilMapper;
import com.entity.Country;
import com.service.CountryService;

@RestController
public class CountryController {
	@Autowired
    private CountryService countryService;

    @RequestMapping(value = "/loadCountries", method = RequestMethod.POST)
    public List<CountryDTO> loadCountries() {

        return DtoUtilMapper.countriesToCountriesDTOs(countryService.findAll());

    }

    @RequestMapping(value = "/saveCountry", method = RequestMethod.POST)
    public List<CountryDTO> saveCountry(@RequestBody Country country) {

        countryService.save(country);

        return DtoUtilMapper.countriesToCountriesDTOs(countryService.findAll());

    }

    @RequestMapping(value = "/deleteCountry", method = RequestMethod.POST)
    public List<CountryDTO> loadCountries(@RequestBody String index) {

        countryService.delete(Integer.parseInt(index));

        return DtoUtilMapper.countriesToCountriesDTOs(countryService.findAll());

    }
}
