package com.tlscontact.frvisa.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tlscontact.frvisa.entity.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>  {
	
	Article findByArticleId(long articleId);
	
    List<Article> findByTitleAndCategory(String title, String category);
    
} 
