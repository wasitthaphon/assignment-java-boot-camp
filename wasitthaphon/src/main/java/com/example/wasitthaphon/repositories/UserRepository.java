package com.example.wasitthaphon.repositories;

import java.util.Optional;

import com.example.wasitthaphon.models.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserId(int id);
}
