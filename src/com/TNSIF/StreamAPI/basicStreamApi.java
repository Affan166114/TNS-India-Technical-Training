package com.TNSIF.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class basicStreamApi {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,78,9,10);
        List<Integer> ed = l.stream().filter(n->n%2!=0).map(n->n*n).collect(Collectors.toList());
        System.out.println(ed);
    }
}
