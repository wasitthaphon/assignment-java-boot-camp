package com.example.wasitthaphon.repositories;

import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.models.Product;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<List<Product>> findByTitleContains(String name, Pageable pageable);

    Optional<Product> findById(int id);

    void updateQuantity(int i);

}
