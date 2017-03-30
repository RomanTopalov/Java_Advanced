package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.entity.Category;


public interface CategoryDao extends JpaRepository<Category, Integer> {
	@Query("select distinct c from Category c left join fetch c.products")
	List<Category> findCategoryWithProduct();
	
	@Query("select distinct c from Category c left join fetch c.products where c.id =:id")
	Category findCategoryWithProduct(@Param("id") int id);
	
}
