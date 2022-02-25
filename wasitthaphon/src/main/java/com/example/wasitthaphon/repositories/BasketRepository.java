package com.example.wasitthaphon.repositories;

import java.util.Optional;

import com.example.wasitthaphon.models.Basket;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BasketRepository extends JpaRepository<Basket, Integer> {
    Optional<Basket> findByBasketId(int id);
}
