package com.example.wasitthaphon.advice_controllers;

import com.example.wasitthaphon.exceptions.FeatureNotFoundException;
import com.example.wasitthaphon.models.ResponseMessage;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class FeatureControllerAdvice {

    @ExceptionHandler(FeatureNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseMessage featureNotFound(FeatureNotFoundException e) {
        ResponseMessage message = new ResponseMessage();

        message.setMessage("Features of product id: " + e.getMessage() + " not found");

        return message;
    }
}
