package com.example.wasitthaphon.repository_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.mock_data.MockDataForTest;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.repositories.ProductRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@DataJpaTest
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void Find_By_Title_Contains_Success() {

        // Arrange
        final String NAME_CONTAINS_KEY = "Adidas NMD";
        final String NAME_CONTAINS_RESULT = "Adidas NMD";

        Pageable pageable = PageRequest.of(0, 5);
        List<Product> products = MockDataForTest.generateProducts();

        productRepository.saveAll(products);

        // Act
        Optional<List<Product>> result = productRepository.findByTitleContains(NAME_CONTAINS_KEY, pageable);

        // Assert
        assertTrue(result.get().size() > 0);

        result.get().forEach(item -> {
            assertTrue(item.getTitle().indexOf(NAME_CONTAINS_RESULT) > -1);
        });
    }

    @Test
    void Find_By_Id_Success() {

        // Arrange
        List<Product> products = MockDataForTest.generateProducts();
        productRepository.saveAll(products);

        // Act
        Optional<Product> result = productRepository.findById(4);

        // Assert
        assertEquals(4, result.get().getId());

    }
}
