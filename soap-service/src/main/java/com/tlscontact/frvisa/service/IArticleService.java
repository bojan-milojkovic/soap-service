package com.tlscontact.frvisa.service;

import java.util.List;
import com.tlscontact.frvisa.entity.Article;

public interface IArticleService {
	
	List<Article> getAllArticles();
    Article getArticleById(long articleId);
    boolean addArticle(Article article);
    void updateArticle(Article article);
    void deleteArticle(Article article);
}
