package com.spring.rentacar.auth.server.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rentacar.auth.server.model.User;

public interface UserDetilsRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String name);
}
