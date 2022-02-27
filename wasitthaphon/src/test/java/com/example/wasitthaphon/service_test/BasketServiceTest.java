package com.example.wasitthaphon.service_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.mock_data.MockDataForTest;
import com.example.wasitthaphon.models.Basket;
import com.example.wasitthaphon.models.BasketRequestBody;
import com.example.wasitthaphon.models.Feature;
import com.example.wasitthaphon.models.FeatureOption;
import com.example.wasitthaphon.models.FeatureSelectedRequestBody;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.models.User;
import com.example.wasitthaphon.repositories.BasketRepository;
import com.example.wasitthaphon.repositories.FeatureOptionRepository;
import com.example.wasitthaphon.repositories.FeatureSelectedRepository;
import com.example.wasitthaphon.repositories.ProductRepository;
import com.example.wasitthaphon.repositories.UserRepository;
import com.example.wasitthaphon.services.BasketService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BasketServiceTest {

    @Mock
    private BasketRepository basketRepository;

    @Mock
    private UserRepository userRepository;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private FeatureSelectedRepository featureSelectedRepository;

    @Mock
    private FeatureOptionRepository featureOptionRepository;

    @Test
    void Get_Basket_By_Id_Success() {
        // Arrange
        Basket basket = new Basket();
        User user = MockDataForTest.generateUserNameRamee();

        basket.setUser(user);
        basket.setProduct(MockDataForTest.generateProducts().get(3));
        basket.setOrderQuantity(1);
        basket.setBasketId(1);

        // Act
        when(basketRepository.findByBasketId(1)).thenReturn(Optional.of(basket));

        BasketService basketService = new BasketService();
        basketService.setBasketRepository(basketRepository);
        basketService.setUserRepository(userRepository);
        basketService.setProductRepository(productRepository);
        basketService.setFeatureSelectedRepository(featureSelectedRepository);
        basketService.setFeatureOptionRepository(featureOptionRepository);

        Basket result = basketService.getBasket(1);

        // Assert
        assertEquals(1, result.getBasketId());
    }

    @Test
    void Create_Basket_Success() {
        // Arrange
        final int BASKET_ID = 1;
        final int PRODUCT_ID = 4;
        final int USER_ID = 1;
        final int INDEX_OF_EXAMPLE_PRODUCT_ID = 3;

        int featureId;
        int featureOptionId;
        User user = MockDataForTest.generateUserNameRamee();
        List<Product> products = MockDataForTest.generateProducts();
        Product tempProduct = new Product();
        BasketRequestBody basketRequestBody = new BasketRequestBody();
        FeatureSelectedRequestBody featureSelectedRequestBody = new FeatureSelectedRequestBody();
        FeatureSelectedRequestBody tempFeatureSelectedRequestBody = new FeatureSelectedRequestBody();
        List<FeatureSelectedRequestBody> featureSelectedRequestBodies = new ArrayList<FeatureSelectedRequestBody>();

        Basket basket = new Basket();
        basket.setBasketId(BASKET_ID);
        basket.setUser(user);
        basket.setOrderQuantity(1);
        basket.setProduct(products.get(INDEX_OF_EXAMPLE_PRODUCT_ID));

        basketRequestBody.setUserId(USER_ID);
        basketRequestBody.setProductId(PRODUCT_ID);
        basketRequestBody.setOrderQuantity(1);

        System.out.println(products.get(INDEX_OF_EXAMPLE_PRODUCT_ID).getId());

        for (int i = 0; i < products.get(INDEX_OF_EXAMPLE_PRODUCT_ID).getFeatures().size(); i++) {
            featureSelectedRequestBody = new FeatureSelectedRequestBody();

            tempProduct = products.get(INDEX_OF_EXAMPLE_PRODUCT_ID);
            featureId = tempProduct.getFeatures().get(i).getId();
            featureOptionId = 1;

            featureSelectedRequestBody.setFeatureId(featureId);
            featureSelectedRequestBody.setFeatureOptionId(featureOptionId);
            featureSelectedRequestBodies.add(featureSelectedRequestBody);
        }

        basketRequestBody.setFeaturesSelectedRequestBodies(featureSelectedRequestBodies);

        // Act

        when(userRepository.findByUserId(USER_ID)).thenReturn(Optional.of(user));
        when(productRepository.findById(PRODUCT_ID)).thenReturn(Optional.of(products.get(INDEX_OF_EXAMPLE_PRODUCT_ID)));

        for (int i = 0; i < featureSelectedRequestBodies.size(); i++) {
            tempFeatureSelectedRequestBody = basketRequestBody.getFeaturesSelectedRequestBodies().get(i);

            featureOptionId = tempFeatureSelectedRequestBody.getFeatureOptionId();

            List<Feature> features = products.get(INDEX_OF_EXAMPLE_PRODUCT_ID).getFeatures();
            List<FeatureOption> featureOptions = features.get(i).getFeatureOptions();
            FeatureOption featureOption = new FeatureOption();

            for (int j = 0; j < featureOptions.size(); j++) {
                if (featureOptions.get(j).getFeatureOptionId() == featureOptionId) {
                    featureOption = featureOptions.get(j);
                }
            }

            when(featureOptionRepository.findByFeatureOptionId(featureOptionId)).thenReturn(Optional.of(featureOption));
        }

        BasketService basketService = new BasketService();
        basketService.setBasketRepository(basketRepository);
        basketService.setUserRepository(userRepository);
        basketService.setProductRepository(productRepository);
        basketService.setFeatureSelectedRepository(featureSelectedRepository);
        basketService.setFeatureOptionRepository(featureOptionRepository);

        Basket result = basketService.createBasket(basketRequestBody);

        // Assert
        assertEquals(1, result.getBasketId());
        assertEquals(4, result.getProduct().getOnhandQuantity());
    }
}
