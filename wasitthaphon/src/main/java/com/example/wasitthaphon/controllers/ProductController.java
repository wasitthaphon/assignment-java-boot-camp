package com.example.wasitthaphon.controllers;

import java.util.List;

import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getProducts(@RequestParam("limit") int limit,
            @RequestParam("search_query") String key) {

        List<Product> products = productService.getProducts(key, limit);

        return products;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        Product product = productService.getProductsById(id);

        return product;
    }
}
