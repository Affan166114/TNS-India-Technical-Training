package com.TNSIF.inheritance;
class Animal1{
    void info(){
        System.out.println("Humans like to keep many domestic animal as there pet");
    }
}

class Dog1 extends Animal1{
    void fact(){
        System.out.println("Dogs are very loyal and they are more suitable for security purpose");
    }
}

class Cat1 extends Animal1{
    void fact(){
        System.out.println("Cats are very cute and they are very clean when compare to dogs");
    }   
}
public class hira {
    public static void main(String[] args) {
        Cat1 c = new Cat1();
        Dog1 d = new Dog1();
        c.info();
        c.fact();
        d.info();
        d.fact();
    }
}
