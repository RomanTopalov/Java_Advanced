package com.dto;

public class CityDTO {

	private String name;
	private String idCountry;

	public CityDTO() {
		// TODO Auto-generated constructor stub
	}

	
	public CityDTO(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}

	public CityDTO(String name, String idCountry) {
		super();
		this.name = name;
		this.idCountry = idCountry;
	}
}
