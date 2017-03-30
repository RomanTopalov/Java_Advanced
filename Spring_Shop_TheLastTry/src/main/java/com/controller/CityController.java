package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.CityDTO;
import com.dto.DtoUtilMapper;
import com.entity.City;
import com.service.CityService;
import com.service.CountryService;

@Controller
public class CityController {
	 @Autowired
	    private CityService cityService;
	    @Autowired
	    private CountryService countryService;

	    @RequestMapping(value = "/newCity", method = RequestMethod.GET)
	    public String newCity(Model model) {
	        model.addAttribute("countries", DtoUtilMapper.countriesToCountriesDTOs(countryService.findAll()));
	        return "views-admin-newCity";
	    }

	    @RequestMapping(value = "/saveCity", method = RequestMethod.POST)
	    public @ResponseBody boolean saveCity(@RequestBody City city) {


	        cityService.save(city);

	        return true;
	    }

	    @RequestMapping(value = "/loadCity", method = RequestMethod.POST)
	    public @ResponseBody List<CityDTO> saveCity() {


	       return DtoUtilMapper.cityToCityDTO(cityService.findAll());

	    }
}
