package com.gestionstk.assafar.dto;

import java.math.BigDecimal;

import com.gestionstk.assafar.model.Article;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class ArticleDto {
	    private Integer id;
	    private String designation;
	    private Integer Qtestock;
	    private BigDecimal  prixunitaire;
	    private BigDecimal  taux;
	    private BigDecimal prixAchat;
	    private String description;
	    private Integer idEntreprise;
	    private CategoryDto category;
	    
	    public static ArticleDto fromEntity(Article article) {
	        if (article == null) {
	          return null;
	        }
	        return ArticleDto.builder()
	            .id(article.getId())
	            .designation(article.getDesignation())
	            .Qtestock(article.getQtestock())
	            .prixunitaire(article.getPrixunitaire())
	             .prixAchat(article.getPrixAchat())
	             .description(article.getDescription())
	            .idEntreprise(article.getIdEntreprise())
	            .category(CategoryDto.fromEntity(article.getCategory()))
	            .build();
	      }

	      public static Article toEntity(ArticleDto articleDto) {
	        if (articleDto == null) {
	          return null;
	        }
	        Article article = new Article();
	        article.setId(articleDto.getId());
	        article.setQtestock(articleDto.getQtestock());	 
	        article.setDesignation(articleDto.getDesignation());
	        article.setPrixAchat(articleDto.getPrixAchat());
	        article.setPrixunitaire(articleDto.getPrixunitaire());
	     
	        article.setIdEntreprise(articleDto.getIdEntreprise());
	        article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));
	        return article;
	      }
	    
	    

}
