package com.example.calculatorjava.models;
//package com.example.calculatorjava.exceptions;

import com.example.calculatorjava.exceptions.DivideByZeroException;
import com.example.calculatorjava.exceptions.InvalidOperationException;
import com.example.calculatorjava.exceptions.InvalidInputException;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws InvalidOperationException, InvalidInputException {
        Scanner scanner = new Scanner(System.in); // Initialize scanner object
        Calculator calculate = new Calculator();

        // Display a welcome message
        System.out.println();
        System.out.println("Welcome to my java calculator CLI app.");
        System.out.println("Type in the operation you wish to perform.");
        System.out.println();
        System.out.println("Addition, Subtraction, Division, Multiplication, Modulos.");
        System.out.println();
        System.out.print("Enter operation name>: ");

        String ops = scanner.nextLine();

        try{
            System.out.print("Enter your first number >: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter your second number >: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            // Use switch to handle operation
            switch (ops) {
                case "Addition":
                    calculate.Add(num1, num2);
                    break;
                case "Subtraction":
                    calculate.Subtract(num1, num2);
                    break;
                case "Division":
                    calculate.Divide(num1, num2);
                    break;
                case "Multiplication":
                    calculate.Multiply(num1, num2);
                    break;
                case "Modulos":
                    calculate.Modulos(num1, num2);
                    break;
                default:
                    throw new InvalidOperationException("This operation is not supported.");
//                System.out.println("Operation not supported");
//                break;
            }
        } catch (NumberFormatException e) {
            throw new InvalidInputException("You must enter a number, no characters or wal3va ; ");
        }
    }

    // Function to add 2 numbers
    void Add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    // Subtract num2 from num1
    void Subtract(int num1, int num2) {
        int sub = num1 - num2;
        System.out.println(sub);
    }

    // Multiply 2 numbers
    void Multiply(int num1, int num2) {
        int mul = num1 * num2;
        System.out.println(mul);
    }

    // Divide 2 numbers
    void Divide(int num1, int num2) throws DivideByZeroException {
        if (num2 == 0) {
            throw new DivideByZeroException("Invalid operation dividing by zero.");
        }
        double div = (double) num1/num2;
        System.out.println(div);
    }

    // Find the modulos of 2 numbers
    void Modulos(int num1, int num2) {
        double mod = (double) num1 % num2;
        System.out.println(mod);
    }
}
