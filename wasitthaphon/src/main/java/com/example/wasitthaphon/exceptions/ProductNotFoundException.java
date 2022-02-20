package com.example.wasitthaphon.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String id) {
        super(id);
    }
}
