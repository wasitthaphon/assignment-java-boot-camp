package com.example.wasitthaphon.controller_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.mock_data.MockDataForTest;
import com.example.wasitthaphon.models.Basket;
import com.example.wasitthaphon.models.BasketRequestBody;
import com.example.wasitthaphon.models.FeatureSelectedRequestBody;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.models.User;
import com.example.wasitthaphon.repositories.BasketRepository;
import com.example.wasitthaphon.repositories.UserRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BasketControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @MockBean
    private BasketRepository basketRepository;

    @MockBean
    private UserRepository userRepository;

    @Test
    void Get_Basket_By_Id_Success() {

        // Arrange
        final int PRODUCT_ID = 4;
        final int BASKET_ID = 1;
        final int FIND_BASKET_BY_ID = 1;
        final String BASKET_URL = "/baskets/";

        Basket basket = new Basket();
        Product product = new Product();
        User user = MockDataForTest.generateUserNameRamee();

        List<Product> products = MockDataForTest.generateProducts();

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == PRODUCT_ID) {
                product = products.get(i);
            }
        }

        basket.setUser(user);
        basket.setProduct(product);
        basket.setOrderQuantity(1);
        basket.setBasketId(BASKET_ID);

        when(basketRepository.findByBasketId(FIND_BASKET_BY_ID)).thenReturn(Optional.of(basket));

        // Act
        Basket result = testRestTemplate.getForObject(BASKET_URL + BASKET_ID, Basket.class);

        // Assert
        assertEquals(BASKET_ID, result.getBasketId());
    }

    @Test
    void Create_Basket_Success() {
        // Arrange
        // 1. Assume products is exist
        // 2. Assume user is exist
        final String BASKET_URL = "/baskets";

        Basket basket = new Basket();
        BasketRequestBody basketRequestBody = new BasketRequestBody();
        FeatureSelectedRequestBody featureSelectedRequestBody = new FeatureSelectedRequestBody();
        User user = MockDataForTest.generateUserNameRamee();

        List<Product> products = new ArrayList<Product>();
        List<FeatureSelectedRequestBody> featureSelectedRequestBodies = new ArrayList<FeatureSelectedRequestBody>();

        products = MockDataForTest.generateProducts();

        featureSelectedRequestBody.setFeatureId(5);
        featureSelectedRequestBody.setFeatureOptionId(11);

        basketRequestBody.setUserId(1);
        basketRequestBody.setProductId(4);
        basketRequestBody.setOrderQuantity(1);
        basketRequestBody.setFeaturesSelectedRequestBodies(featureSelectedRequestBodies);

        basket.setBasketId(1);
        basket.setProduct(products.get(3));
        basket.setUser(user);
        basket.setOrderQuantity(1);

        basketRequestBody.setFeaturesSelectedRequestBodies(featureSelectedRequestBodies);

        HttpHeaders headers = new HttpHeaders();
        HttpEntity<BasketRequestBody> request = new HttpEntity<>(basketRequestBody, headers);

        when(userRepository.findByUserId(1)).thenReturn(Optional.of(user));
        when(basketRepository.count()).thenReturn((long) 0);
        when(basketRepository.save(basket)).thenReturn(basket);

        // Act
        ResponseEntity<Basket> result = this.testRestTemplate.postForEntity(BASKET_URL, request,
                Basket.class);

        // Assert
        assertEquals(1, result.getBody().getBasketId());

    }

}
