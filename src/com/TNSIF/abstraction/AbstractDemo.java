package com.TNSIF.abstraction;
abstract class Animal {
   
    void eat() {
        System.out.println("This animal eats food.");
    }

    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.eat();  // Inherited concrete method
        myDog.sound(); // Overridden method in Dog class

        myCat.eat();  // Inherited concrete method
        myCat.sound(); // Overridden method in Cat class
    }
}
