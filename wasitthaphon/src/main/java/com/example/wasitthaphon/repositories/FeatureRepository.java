package com.example.wasitthaphon.repositories;

import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.models.Feature;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature, Integer> {

    Optional<List<Feature>> findByProductId(int id);
}
