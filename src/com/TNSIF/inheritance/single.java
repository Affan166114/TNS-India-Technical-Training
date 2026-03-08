package com.TNSIF.inheritance;

class Animal{
    void info(){
        System.out.println("Animal are very kind and selective to eat food");
    }
}

class Cat extends Animal{
    void fact(){
        System.out.println("Cats are very cute and they are very good pets");
    }
}

public class single {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.info();
        c.fact();
    }
}
