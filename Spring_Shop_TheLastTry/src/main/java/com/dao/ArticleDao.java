package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Article;

public interface ArticleDao  extends JpaRepository<Article, Integer>{

}
