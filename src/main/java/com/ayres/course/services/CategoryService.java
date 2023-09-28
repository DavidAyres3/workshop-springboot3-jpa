package com.ayres.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayres.course.entities.Category;
import com.ayres.course.repositories.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	//injeção de dependência automática
	
	private CategoryRepository repository;
	//variável usada para acessar os métodos do UserRepository
	
	public List<Category> findAll(){
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
