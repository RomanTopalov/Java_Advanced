package com.service;

import java.util.List;

import com.proj.Article;

public interface ArticleService {
	void create(Article article);
	List<Article>findAll();
	Article findOne(String name);
	void delete(String name);
}
