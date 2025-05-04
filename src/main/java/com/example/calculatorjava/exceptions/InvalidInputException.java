package com.example.calculatorjava.exceptions;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {

        super(message);
    }
}
