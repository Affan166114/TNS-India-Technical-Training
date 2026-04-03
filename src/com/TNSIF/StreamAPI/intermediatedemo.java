package com.TNSIF.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class intermediatedemo {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,78,9,10,1,9,6,7,10,11,16,32,61,12,87,15,16);
        List<Integer> f = l.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(f);
        
        List<Integer> m = l.stream().filter(n -> n % 2 == 0).map(n -> n * n).collect(Collectors.toList());
        System.out.println(m);

        List<Integer> d = l.stream().distinct().collect(Collectors.toList());
        System.out.println(d);

        List<Integer> s = l.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(s);

        List<Integer> li = l.stream().sorted().distinct().limit(3).collect(Collectors.toList());
        System.out.println(li);

        List<Integer> sk = l.stream().sorted().distinct().skip(3).collect(Collectors.toList());
        System.out.println(sk);


    }
}
