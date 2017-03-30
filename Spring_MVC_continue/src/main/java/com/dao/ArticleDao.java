package com.dao;

import java.util.List;

import com.proj.Article;


public interface ArticleDao {
	void save(Article article);
	List<Article>findAll();
	Article findOne(String name);
	void delete(String name);
}
