package com.example.wasitthaphon.repositories;

import java.util.Optional;

import com.example.wasitthaphon.models.FeatureOption;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureOptionRepository extends JpaRepository<FeatureOption, Integer> {

    Optional<FeatureOption> findByFeatureOptionId(int id);
}
