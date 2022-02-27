package com.example.wasitthaphon.service_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.mock_data.MockDataForTest;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.repositories.ProductRepository;
import com.example.wasitthaphon.services.ProductService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @Test
    void Get_Product_Name_Contains_Success() {

        // Arrange
        final String NAME_CONTAINS_KEY = "Adidas NMD";
        final String NAME_CONTAINS_RESULT = "Adidas NMD";
        final int PAGE_LIMIT = 5;

        List<Product> products = MockDataForTest.generateProducts();
        ProductService productService = new ProductService();
        Pageable pageable = PageRequest.of(0, PAGE_LIMIT);
        productService.setProductRepository(productRepository);

        when(productRepository.findByTitleContains(NAME_CONTAINS_KEY, pageable)).thenReturn(Optional.of(products));

        // Act
        List<Product> result = productService.getProducts(NAME_CONTAINS_KEY, PAGE_LIMIT);

        // Assert
        assertTrue(!result.isEmpty());

        result.forEach(item -> {
            assertTrue(item.getTitle().indexOf(NAME_CONTAINS_RESULT) > -1);
        });

    }

    @Test
    void Get_Product_By_Id_Success() {

        // Arrange
        final int ACTUAL_ID = 4;

        List<Product> products = MockDataForTest.generateProducts();
        Product product = new Product();
        ProductService productService = new ProductService();
        productService.setProductRepository(productRepository);

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == ACTUAL_ID) {
                product = products.get(i);
            }
        }

        when(productRepository.findById(ACTUAL_ID)).thenReturn(Optional.of(product));

        // Act
        Product result = productService.getProductsById(ACTUAL_ID);

        // Assert
        assertEquals(4, result.getId());

    }

}
