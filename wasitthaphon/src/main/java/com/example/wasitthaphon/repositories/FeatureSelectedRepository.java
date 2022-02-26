package com.example.wasitthaphon.repositories;

import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.models.FeatureSelected;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureSelectedRepository extends JpaRepository<FeatureSelected, Integer> {

    Optional<List<FeatureSelected>> findByProductId(int id);
}
