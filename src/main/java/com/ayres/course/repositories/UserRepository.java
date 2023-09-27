package com.ayres.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayres.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
}
