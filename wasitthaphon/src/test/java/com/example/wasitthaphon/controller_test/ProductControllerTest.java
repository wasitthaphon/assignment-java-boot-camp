package com.example.wasitthaphon.controller_test;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.mock_data.MockDataForTest;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.repositories.FeatureOptionRepository;
import com.example.wasitthaphon.repositories.FeatureRepository;
import com.example.wasitthaphon.repositories.ProductImageRepository;
import com.example.wasitthaphon.repositories.ProductRepository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ProductControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private ProductRepository productRepository;

    @MockBean
    private FeatureRepository featureRepository;

    @MockBean
    private FeatureOptionRepository featureOptionRepository;

    @MockBean
    private ProductImageRepository productImageRepository;

    @Test
    void Get_Product_Title_Contains_Limit5_Success() {
        // Arrange
        int pageSize = 5;
        Pageable pageable = PageRequest.of(0, pageSize);
        List<Product> products = MockDataForTest.generateProducts();

        when(productRepository.findByTitleContains("Adidas NMD", pageable)).thenReturn(Optional.of(products));

        // Act
        Product[] response = testRestTemplate.getForObject(
                "/products?search_query=Adidas NMD&limit=" + pageSize, Product[].class);

        // Assert
        Assertions.assertEquals(5, response.length);
        for (int i = 0; i < response.length; i++) {
            Assertions.assertTrue(response[i].getTitle().indexOf("Adidas NMD") > -1 ? true : false);
        }
    }

    @Test
    void Get_Product_Id_4_Success() {
        // Arrange
        int KEY = 4;
        List<Product> products = MockDataForTest.generateProducts();
        Product product = new Product();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == KEY) {
                product = products.get(i);
            }
        }

        when(productRepository.findById(4)).thenReturn(Optional.of(product));

        // Act
        Product result = testRestTemplate.getForObject(
                "/products/" + KEY, Product.class);

        // Assert
        Assertions.assertEquals(4, result.getId());
    }
}
