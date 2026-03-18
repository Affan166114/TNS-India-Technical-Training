package com.TNSIF.LamdaExpression;

import java.util.*;

public class Le {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1,8,9,8,6,41,5,2,6,45,54,94));
        l.add(5);

        System.out.println("All elements in the list:");
        l.forEach(n-> System.out.println(n));

        System.out.println("Even numbers in the list:");
        l.forEach(n->{
            if(n%2==0){
                System.out.println("Present Even Number: " + n);
            }
        });
    }
}
