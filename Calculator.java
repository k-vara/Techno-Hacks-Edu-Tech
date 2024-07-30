package com.Apjfs;

import java.util.Scanner;

public class Calculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input first number
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();

	        // Input second number
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        // Display menu for operations
	        System.out.println("Choose operation:");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");
	        System.out.print("Enter your choice (1/2/3/4): ");
	        int choice = scanner.nextInt();

	        // Perform operations based on user choice
	        switch (choice) {
	            case 1: 
	            	double resultAdd = num1 + num2;
	            	//printing the addition result of the two numbers
	                System.out.println("Addition result: " + num1 + " + " + num2 + " = " + resultAdd);
	                break;
	            case 2:
	                double resultSubtract = num1 - num2;
	              //printing the subtract result of the two numbers
	                System.out.println("Subtraction result: " + num1 + " - " + num2 + " = " + resultSubtract);
	                break;
	            case 3:
	                double resultMultiply = num1 * num2;
	                //printing the Multiplication result of the two numbers
	                System.out.println("Multiplication result: " + num1 + " * " + num2 + " = " + resultMultiply);
	                break;
	            case 4:
	                if (num2 == 0) {
	                    System.out.println("Error: Division by zero");
	                } else {
	                    double resultDivide = num1 / num2;
	                    //if the condition is false then it will print the division result of two numbers
	                    System.out.println("Division result: " + num1 + " / " + num2 + " = " + resultDivide);
	                }
	                break;
	            default:
	                System.out.println("Invalid choice");
	        }

	        scanner.close();
	    }
	}