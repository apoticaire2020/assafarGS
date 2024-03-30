package com.gestionstk.assafar.services.impl;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionstk.assafar.dto.CategoryDto;
import com.gestionstk.assafar.exception.EntityNotFoundException;
import com.gestionstk.assafar.exception.ErrorCodes;
import com.gestionstk.assafar.repository.ArticleRepository;
import com.gestionstk.assafar.repository.CategoryRepository;
import com.gestionstk.assafar.services.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService {
	
	private CategoryRepository categoryRepository;
	private ArticleRepository articleRepository;
	
	
    @Autowired
	public CategoryServiceImpl(CategoryRepository categoryRepository, ArticleRepository articleRepository) {
		this.categoryRepository = categoryRepository;
		this.articleRepository = articleRepository;
	}

	@Override
	public CategoryDto save(CategoryDto dto) {
		
		return CategoryDto.fromEntity(categoryRepository.save(CategoryDto.toEntity(dto)));
		
	}

	@Override
	public CategoryDto findById(Integer id) {
		return categoryRepository.findById(id).map(CategoryDto::fromEntity)
				.orElseThrow(()-> new EntityNotFoundException("Aucune category avec l'ID = " + id + " n' ete trouve dans la BDD", ErrorCodes.CATEGORY_NOT_FOUND));
	}

	@Override
	public CategoryDto findByCode(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDto> findAll() {
		return categoryRepository.findAll().stream()
				.map(CategoryDto::fromEntity).collect(Collectors.toList())	;
	}

	@Override
	public void delete(Integer id) {
		categoryRepository.deleteById(id);
		
	}

}
