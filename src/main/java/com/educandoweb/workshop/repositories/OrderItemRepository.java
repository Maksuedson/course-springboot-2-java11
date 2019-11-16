package com.educandoweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
