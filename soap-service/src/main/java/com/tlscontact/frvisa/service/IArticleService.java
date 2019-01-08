package com.tlscontact.frvisa.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import com.tlscontact.frvisa.entity.Article;

@WebService
public interface IArticleService {
	
	@WebMethod List<Article> getAllArticles();
	@WebMethod Article getArticleById(long articleId);
	@WebMethod boolean addArticle(Article article);
	@WebMethod void updateArticle(Article article);
	@WebMethod void deleteArticle(Article article);
}
