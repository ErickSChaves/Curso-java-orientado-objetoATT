package com.erickchaves.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickchaves.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
