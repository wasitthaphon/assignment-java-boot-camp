package com.example.wasitthaphon.advice_controllers;

import com.example.wasitthaphon.exceptions.UserNotFoundException;
import com.example.wasitthaphon.models.ResponseMessage;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class UserControllerAdvice {
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseMessage userNotFound(UserNotFoundException e) {
        ResponseMessage message = new ResponseMessage();

        message.setMessage("User not found: " + e.getMessage());

        return message;
    }
}
