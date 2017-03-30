package com.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ArticleDao;
import com.proj.Article;
import com.proj.Product;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	@PersistenceContext(unitName = "Primary")
	private EntityManager entityManager;

	@Transactional
	public void save(Article article) {
		// TODO Auto-generated method stub
		entityManager.persist(article);
	}

	@Transactional
	public List<Article> findAll() {
		// TODO Auto-generated method stub
		return entityManager.createNamedQuery("findAllArticle").getResultList();
	}

	@Transactional
	public Article findOne(String name) {
		return  (Article) entityManager.createQuery("findOneArticle").getSingleResult();
	}

	@Transactional
	public void delete(String name) {
		entityManager.remove(name);

	}

}
