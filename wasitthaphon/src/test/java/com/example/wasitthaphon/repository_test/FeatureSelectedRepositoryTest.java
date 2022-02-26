package com.example.wasitthaphon.repository_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import com.example.wasitthaphon.models.FeatureSelected;
import com.example.wasitthaphon.repositories.FeatureSelectedRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class FeatureSelectedRepositoryTest {

    @Autowired
    private FeatureSelectedRepository featureSelectedRepository;

    @Test
    void Find_By_Id_Success() {

        // Arrange
        FeatureSelected featureSelected = new FeatureSelected();
        featureSelected.setId(1);
        featureSelectedRepository.save(featureSelected);

        // Act
        Optional<FeatureSelected> result = featureSelectedRepository.findById(1);

        // Assert
        assertEquals(1, result.get().getId());

    }

}
