package com.example.wasitthaphon.exceptions;

public class BasketNotFoundException extends RuntimeException {
    public BasketNotFoundException(String id) {
        super(id);
    }
}
