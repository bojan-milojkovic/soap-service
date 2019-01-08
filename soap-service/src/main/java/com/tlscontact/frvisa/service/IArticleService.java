package com.tlscontact.frvisa.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.tlscontact.frvisa.entity.Article;
import com.tlscontact.frvisa.generated.GetArticleByIdRequest;
import com.tlscontact.frvisa.generated.ObjectFactory;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IArticleService {
	
	@WebMethod(operationName="myGetAllArticles") List<Article> getAllArticles();
	@WebMethod(operationName="getArticleById") Article getArticleById(GetArticleByIdRequest req);
	@WebMethod boolean addArticle(Article article);
	@WebMethod void updateArticle(Article article);
	@WebMethod void deleteArticle(Article article);
}
