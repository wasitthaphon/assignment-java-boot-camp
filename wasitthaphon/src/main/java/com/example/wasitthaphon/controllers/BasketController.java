package com.example.wasitthaphon.controllers;

import com.example.wasitthaphon.models.Basket;
import com.example.wasitthaphon.models.BasketRequestBody;
import com.example.wasitthaphon.services.BasketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasketController {

    @Autowired
    private BasketService basketService;

    @GetMapping("/baskets/{basketId}")
    public Basket getBasket(@PathVariable("basketId") int basketId) {
        Basket basket = basketService.getBasket(basketId);

        return basket;
    }

    @PostMapping("/baskets")
    public Basket createBasket(@RequestBody BasketRequestBody basketRequestBody) {
        Basket basket = basketService.createBasket(basketRequestBody);

        return basket;
    }
}
