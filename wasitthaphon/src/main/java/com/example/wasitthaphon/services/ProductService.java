package com.example.wasitthaphon.services;

import java.util.List;
import java.util.Optional;

import com.example.wasitthaphon.exceptions.ProductNotFoundException;
import com.example.wasitthaphon.models.Product;
import com.example.wasitthaphon.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    FeatureService featureService;

    public List<Product> getProducts() {
        List<Product> products = productRepository.findAll();

        return products;
    }

    public List<Product> getProducts(String productName, int limit) {

        Pageable pageable = PageRequest.of(0, limit);
        Optional<List<Product>> products = productRepository.findByTitleContains(productName, pageable);

        if (products.isPresent()) {
            return products.get();
        }
        throw new ProductNotFoundException(productName);
    }

    public Product getProductsById(int id) {
        Optional<Product> product = productRepository.findById(id);

        if (product.isPresent()) {
            return product.get();
        }

        throw new ProductNotFoundException(String.valueOf(id));
    }

}
