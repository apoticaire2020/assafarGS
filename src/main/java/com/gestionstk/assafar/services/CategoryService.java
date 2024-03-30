package com.gestionstk.assafar.services;

import java.util.List;

import com.gestionstk.assafar.dto.CategoryDto;

public interface CategoryService {

	 CategoryDto save(CategoryDto dto);

	  CategoryDto findById(Integer id);

	  CategoryDto findByCode(String code);

	  List<CategoryDto> findAll();

	  void delete(Integer id);
}
