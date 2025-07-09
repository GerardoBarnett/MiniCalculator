package com.calculator;

import java.util.Scanner;

/**
 * Main class to run the calculator application from the console.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        System.out.println("Welcome to Mini Calculator");
        System.out.println("==========================");
        
        boolean running = true;
        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }
            
            if (choice == 3) {
                running = false;
                System.out.println("Thank you for using Mini Calculator!");
                continue;
            }
            
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
                continue;
            }
            
            System.out.print("Enter first number: ");
            double num1;
            try {
                num1 = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }
            
            System.out.print("Enter second number: ");
            double num2;
            try {
                num2 = Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }
            
            double result;
            if (choice == 1) {
                result = calculator.add(num1, num2);
                System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
            } else {
                result = calculator.subtract(num1, num2);
                System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
            }
        }
        
        scanner.close();
    }
}