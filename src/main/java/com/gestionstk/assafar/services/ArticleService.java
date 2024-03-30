package com.gestionstk.assafar.services;

import java.util.List;

import com.gestionstk.assafar.dto.ArticleDto;

public interface ArticleService {
	
	 ArticleDto save(ArticleDto dto);

	  ArticleDto findById(Integer id);

	  ArticleDto findByCodeArticle(String codeArticle);

	  List<ArticleDto> findAll();

	 // List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

	 // List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

	  List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

	  void delete(Integer id);

}
