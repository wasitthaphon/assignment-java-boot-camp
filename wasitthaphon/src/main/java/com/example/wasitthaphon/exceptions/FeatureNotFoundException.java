package com.example.wasitthaphon.exceptions;

public class FeatureNotFoundException extends RuntimeException {
    public FeatureNotFoundException(String id) {
        super(id);
    }
}
