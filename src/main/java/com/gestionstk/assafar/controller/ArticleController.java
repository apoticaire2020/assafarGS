package com.gestionstk.assafar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.gestionstk.assafar.controller.api.ArticleApi;
import com.gestionstk.assafar.dto.ArticleDto;
import com.gestionstk.assafar.services.ArticleService;

@RestController
public class ArticleController implements ArticleApi{
	
	private ArticleService articleService;
	
	 @Autowired
	  public ArticleController( ArticleService articleService) {
	    this.articleService = articleService;
	  }

	@Override
	public ArticleDto save(ArticleDto dto) {
		
		return articleService.save(dto);
	}

	@Override
	public List<ArticleDto> findAll() {
	    return  articleService.findAll();
	}

	@Override
	public ArticleDto findById(Integer id) {
		return articleService.findById(id);
	}

	@Override
	public List<ArticleDto> findAllArticleByIdCategory(Integer idCategory) {
		return articleService.findAllArticleByIdCategory(idCategory);
	}

	@Override
	public void delete(Integer id) {
		articleService.delete(id);
		
	}
	

}
