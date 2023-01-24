package com.erickchaves.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erickchaves.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
