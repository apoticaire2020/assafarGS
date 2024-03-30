package com.gestionstk.assafar.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionstk.assafar.dto.ArticleDto;
import com.gestionstk.assafar.exception.EntityNotFoundException;
import com.gestionstk.assafar.exception.ErrorCodes;
import com.gestionstk.assafar.repository.ArticleRepository;
import com.gestionstk.assafar.services.ArticleService;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService{
	
	private ArticleRepository articleRepository;
	

	@Autowired
	public ArticleServiceImpl(ArticleRepository articleRepository) {
			this.articleRepository = articleRepository;
	}

	@Override
	public ArticleDto save(ArticleDto dto) {
		return ArticleDto.fromEntity(articleRepository.save(ArticleDto.toEntity(dto)));
	}

	@Override
	public ArticleDto findById(Integer id) {
		if (id==null) {
			log.error("Article ID is null");
		      return null;
		}
		return articleRepository.findById(id).map(ArticleDto::fromEntity).orElseThrow(
				()-> new EntityNotFoundException("Aucun article avec l'ID = " + id + " n' ete trouve dans la BDD", ErrorCodes.ARTICLE_NOT_FOUND));
	}

	@Override
	public ArticleDto findByCodeArticle(String codeArticle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArticleDto> findAll() {
		return articleRepository.findAll().stream()
				.map(ArticleDto::fromEntity).collect(Collectors.toList());
	}

	@Override
	public List<ArticleDto> findAllArticleByIdCategory(Integer idCategory) {
		return articleRepository.findAllByCategoryId(idCategory).stream()
				.map(ArticleDto::fromEntity)
				.collect(Collectors.toList());
	}

	@Override
	public void delete(Integer id) {
		articleRepository.deleteById(id);
		
	}

}
