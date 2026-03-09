package com.TNSIF.polymorphism;

class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }
    
    // Method to add two decimal values
    double add(double a, double b) {
        return a + b;
    }
}

public class overload {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println(calc.add(5, 3));          
        System.out.println(calc.add(5.5, 3.3));    
    }
}
