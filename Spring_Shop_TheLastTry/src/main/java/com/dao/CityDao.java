package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.City;

public interface CityDao extends JpaRepository<City, Integer> {

}
