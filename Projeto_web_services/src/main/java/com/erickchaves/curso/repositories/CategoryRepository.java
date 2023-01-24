package com.erickchaves.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickchaves.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
