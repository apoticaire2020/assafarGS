package com.gestionstk.assafar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestionstk.assafar.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	Optional<Category> findCategoryByCode(String code);

}
