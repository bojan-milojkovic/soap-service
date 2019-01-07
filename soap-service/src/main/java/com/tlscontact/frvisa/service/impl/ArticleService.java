package com.tlscontact.frvisa.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tlscontact.frvisa.entity.Article;
import com.tlscontact.frvisa.repository.ArticleRepository;
import com.tlscontact.frvisa.service.IArticleService;

@Service
public class ArticleService implements IArticleService {
	
	@Autowired
	private ArticleRepository articleRepository;

	@Override
	public Article getArticleById(long articleId) {
		Article obj = articleRepository.findByArticleId(articleId);
		return obj;
	}	
	
	@Override
	public List<Article> getAllArticles(){
		return articleRepository.findAll();
	}
	
	@Override
	public synchronized boolean addArticle(Article article){
        List<Article> list = articleRepository.findByTitleAndCategory(article.getTitle(), article.getCategory()); 	
        if (list.size() > 0) {
           return false;
        } else {
           article = articleRepository.save(article);
           return true;
        }
	}
	
	@Override
	public void updateArticle(Article article) {
		articleRepository.save(article);
	}
	
	
	@Override
	public void deleteArticle(Article article) {
		articleRepository.delete(article);
	}
}