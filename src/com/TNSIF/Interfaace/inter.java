package com.TNSIF.Interfaace;

interface Animal {
    void eat();
}

interface Mammal extends Animal {
    void walk();
}

class Human implements Mammal {
    @Override
    public void eat() {
        System.out.println("Human eats food.");
    }

    @Override
    public void walk() {
        System.out.println("Human walks on two legs.");
    }
}

public class inter {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.walk();
    }
}
