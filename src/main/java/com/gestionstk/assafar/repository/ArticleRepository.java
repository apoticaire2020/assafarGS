package com.gestionstk.assafar.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstk.assafar.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer>{

	  Optional<Article> findArticleById(Integer id);

	  List<Article> findAllByCategoryId(Integer idCategory);

}
