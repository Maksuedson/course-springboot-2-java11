package com.educandoweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
