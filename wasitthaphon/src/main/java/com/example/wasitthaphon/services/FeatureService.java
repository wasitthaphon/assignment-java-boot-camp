package com.example.wasitthaphon.services;

import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.exceptions.FeatureNotFoundException;
import com.example.wasitthaphon.models.Feature;
import com.example.wasitthaphon.repositories.FeatureRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeatureService {

    @Autowired
    FeatureRepository featureRepository;

    public List<Feature> getFeaturesByProductId(int id) {
        Optional<List<Feature>> features = featureRepository.findByProductId(id);

        if (features.isPresent()) {
            return features.get();
        }

        throw new FeatureNotFoundException(String.valueOf(id));
    }

}
