package com.example.wasitthaphon.repository_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import com.example.wasitthaphon.models.Feature;
import com.example.wasitthaphon.models.FeatureOption;
import com.example.wasitthaphon.repositories.FeatureOptionRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class FeatureOptionRepositoryTest {

    @Autowired
    private FeatureOptionRepository featureOptionRepository;

    @Test
    void Find_By_Id_Success() {

        // Arrange
        FeatureOption featureOption = new FeatureOption();
        Feature feature = new Feature();

        feature.setId(1);
        feature.setName("Size");
        featureOption.setFeatureOptionId(1);
        featureOption.setFeature(feature);
        featureOption.setOption("EU:40");
        featureOptionRepository.save(featureOption);

        // Act
        Optional<FeatureOption> result = featureOptionRepository.findByFeatureOptionId(1);

        // Assert
        assertEquals(1, result.get().getFeatureOptionId());

    }
}
