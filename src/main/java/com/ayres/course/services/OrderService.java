package com.ayres.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayres.course.entities.Order;
import com.ayres.course.repositories.OrderRepository;


@Service
public class OrderService {
	
	@Autowired
	//injeção de dependência automática
	
	private OrderRepository repository;
	//variável usada para acessar os métodos do UserRepository
	
	public List<Order> findAll(){
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
