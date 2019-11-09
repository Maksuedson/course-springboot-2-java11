package com.educandoweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
