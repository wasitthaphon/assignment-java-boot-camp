package com.example.wasitthaphon.repository_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import com.example.wasitthaphon.models.Basket;
import com.example.wasitthaphon.repositories.BasketRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class BasketRepositoryTest {

    @Autowired
    private BasketRepository basketRepository;

    @Test
    void Find_By_Id_Success() {

        // Arrange
        Basket basket = new Basket();
        basket.setBasketId(1);
        basketRepository.save(basket);

        // Act
        Optional<Basket> result = basketRepository.findByBasketId(1);

        //
        assertEquals(1, result.get().getBasketId());

    }
}
