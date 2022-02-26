package com.example.wasitthaphon.exceptions;

public class FeatureOptionNotFoundException extends RuntimeException {
    public FeatureOptionNotFoundException(String id) {
        super(id);
    }
}
