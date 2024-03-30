package com.gestionstk.assafar.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestionstk.assafar.model.Category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {

    	private Integer id;
	    private String code;
        private String libcategorie;
        private Integer idEntreprise;

	  @JsonIgnore
	  private List<ArticleDto> articles;

	  public static CategoryDto fromEntity(Category category) {
	    if (category == null) {
	      return null;
	      // TODO throw an exception
	    }

	    return CategoryDto.builder()
	        .id(category.getId())
	        .code(category.getCode())
	        .libcategorie(category.getLibcategorie())
	        .idEntreprise(category.getIdEntreprise())
	        .build();
	  }

	  public static Category toEntity(CategoryDto categoryDto) {
	    if (categoryDto == null) {
	      return null;
	      // TODO throw an exception
	    }

	    Category category = new Category();
	    category.setId(categoryDto.getId());
	    category.setCode(categoryDto.getCode());
	    category.setLibcategorie(categoryDto.getLibcategorie());
	    category.setIdEntreprise(categoryDto.getIdEntreprise());

	    return category;
	  }
}
