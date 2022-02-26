package com.example.wasitthaphon.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String id) {
        super(id);
    }
}
