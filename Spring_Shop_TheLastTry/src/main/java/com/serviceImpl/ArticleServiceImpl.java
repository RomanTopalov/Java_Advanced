package com.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ArticleDao;
import com.entity.Article;
import com.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;

	public void save(Article article) {
	articleDao.save(article);

	}

	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return articleDao.findAll();
	}

	public Article findOne(int id) {
		// TODO Auto-generated method stub
		return articleDao.findOne(id);
	}

	public void delete(int id) {
		
		articleDao.delete(id);
	}

}
