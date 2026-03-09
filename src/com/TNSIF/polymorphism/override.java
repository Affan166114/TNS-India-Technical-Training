package com.TNSIF.polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class override {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();  

        myAnimal.sound(); 
    }
}
