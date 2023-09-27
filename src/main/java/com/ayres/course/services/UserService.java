package com.ayres.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayres.course.entities.User;
import com.ayres.course.repositories.UserRepository;


@Service
public class UserService {
	
	@Autowired
	//injeção de dependência automática
	
	private UserRepository repository;
	//variável usada para acessar os métodos do UserRepository
	
	public List<User> findAll(){
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
