package com.TNSIF.FunctionalInterface;

import java.util.Scanner;

interface functional{
    int operations(int a, int b);
}

public class fi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        functional add = (a, b) -> a + b;
        functional subtract = (a, b) -> a - b;
        functional multiply = (a, b) -> a * b;
        functional divide = (a, b) -> a / b;

        System.out.println("Simple Calculator \n \nPlease enter two numbers to perform basic operations");

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Addition: " + add.operations(num1, num2));
        System.out.println("Subtraction: " + subtract.operations(num1, num2));
        System.out.println("Multiplication: " + multiply.operations(num1, num2));
        System.out.println("Division: " + divide.operations(num1, num2));
        
    }
}
