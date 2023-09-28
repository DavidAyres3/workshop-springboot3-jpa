package com.ayres.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayres.course.entities.Product;
import com.ayres.course.repositories.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	//injeção de dependência automática
	
	private ProductRepository repository;
	//variável usada para acessar os métodos do ProductRepository
	
	public List<Product> findAll(){
		return repository.findAll();
	}

	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
