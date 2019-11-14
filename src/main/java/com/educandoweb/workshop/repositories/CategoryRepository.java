package com.educandoweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
