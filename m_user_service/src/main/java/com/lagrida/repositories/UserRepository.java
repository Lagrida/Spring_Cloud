package com.lagrida.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lagrida.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUsername(String username);
	Optional<User> findById(long id);
}
