package com.TNSIF.inheritance;

class Anibath{
    void info(){
        System.out.println("most of the animals loves to bath except some");
    }
}

class cat extends Anibath{
    void fact(){
        System.out.println("Cats are very good and like to clean themselves rather than giving bath");
    }
}

class indian extends cat{
    void indcat(){
        System.out.println("Indian cat and Bengal cat are very active when compare to Persian cat");
    }
}

public class multilevel {
    public static void main(String[] args) {
        indian i = new indian();
        i.info();
        i.fact();
        i.indcat();
    }
}
