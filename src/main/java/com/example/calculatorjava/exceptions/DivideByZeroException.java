package com.example.calculatorjava.exceptions;

public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String message) {

        super(message);
        System.out.println("You tried dividing a number by zero, it never works. So stop!!!");
    }
}
