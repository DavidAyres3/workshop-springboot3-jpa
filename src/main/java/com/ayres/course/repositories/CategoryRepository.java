package com.ayres.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayres.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
	
}
