package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ArticleDao;
import com.proj.Article;
import com.service.ArticleService;
@Service("articleService")
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;
	
	public void create(Article article) {
		articleDao.save(article);
		
	}

	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return articleDao.findAll();
	}

	public Article findOne(String name) {
		// TODO Auto-generated method stub
		return articleDao.findOne(name);
	}

	public void delete(String name) {
		// TODO Auto-generated method stub
		articleDao.delete(name);
	}

}
