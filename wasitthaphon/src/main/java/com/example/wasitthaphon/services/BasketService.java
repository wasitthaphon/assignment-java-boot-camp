package com.example.wasitthaphon.services;

import java.util.Optional;

import com.example.wasitthaphon.exceptions.BasketNotFoundException;
import com.example.wasitthaphon.exceptions.FeatureOptionNotFoundException;
import com.example.wasitthaphon.exceptions.ProductNotFoundException;
import com.example.wasitthaphon.exceptions.UserNotFoundException;
import com.example.wasitthaphon.models.Basket;
import com.example.wasitthaphon.models.BasketRequestBody;
import com.example.wasitthaphon.models.FeatureOption;
import com.example.wasitthaphon.models.FeatureSelected;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.models.User;
import com.example.wasitthaphon.repositories.BasketRepository;
import com.example.wasitthaphon.repositories.FeatureOptionRepository;
import com.example.wasitthaphon.repositories.FeatureSelectedRepository;
import com.example.wasitthaphon.repositories.ProductRepository;
import com.example.wasitthaphon.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasketService {

    @Autowired
    private BasketRepository basketRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private FeatureSelectedRepository featureSelectedRepository;

    @Autowired
    private FeatureOptionRepository featureOptionRepository;

    public Basket getBasket(int basketId) {
        Optional<Basket> basket = basketRepository.findByBasketId(basketId);

        if (basket.isPresent()) {
            return basket.get();
        }

        throw new BasketNotFoundException(Integer.toString(basketId));

    }

    public Basket createBasket(BasketRequestBody basketRequestBody) {
        Basket basket = new Basket();
        Optional<User> user;
        Optional<Product> product;

        user = userRepository.findByUserId(basketRequestBody.getUserId());

        if (!user.isPresent()) {
            throw new UserNotFoundException(Integer.toString(basketRequestBody.getUserId()));
        }

        product = productRepository.findById(basketRequestBody.getProductId());

        if (!product.isPresent()) {
            throw new ProductNotFoundException(Integer.toString(basketRequestBody.getProductId()));
        }

        // create selected features

        basketRequestBody.getFeaturesSelectedRequestBodies().forEach(item -> {
            FeatureSelected featureSelected = new FeatureSelected();
            Optional<FeatureOption> option;
            featureSelected.setId((int) featureSelectedRepository.count() + 1);
            featureSelected.setUser(user.get());
            featureSelected.setProduct(product.get());

            option = featureOptionRepository.findByFeatureOptionId(item.getFeatureOptionId());

            if (!option.isPresent()) {
                throw new FeatureOptionNotFoundException(Integer.toString(item.getFeatureOptionId()));
            }
            featureSelected.setFeatureOption(option.get());
            featureSelectedRepository.save(featureSelected);

        });

        basket.setUser(user.get());
        basket.setBasketId((int) basketRepository.count() + 1);
        basket.setOrderQuantity(basketRequestBody.getOrderQuantity());
        basket.setProduct(product.get());
        product.get().setOnhandQuantity(product.get().getOnhandQuantity() - basketRequestBody.getOrderQuantity());
        productRepository.save(product.get());
        basketRepository.save(basket);

        return basket;

    }

    public void setBasketRepository(BasketRepository basketRepository) {
        this.basketRepository = basketRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void setFeatureSelectedRepository(FeatureSelectedRepository featureSelectedRepository) {
        this.featureSelectedRepository = featureSelectedRepository;
    }

    public void setFeatureOptionRepository(FeatureOptionRepository featureOptionRepository) {
        this.featureOptionRepository = featureOptionRepository;
    }

}
