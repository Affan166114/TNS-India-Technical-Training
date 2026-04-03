package com.TNSIF.StreamAPI;
import java.util.*;

public class terminalDemo {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,78,9,10,1,9,6,7,10,11,16,32,61,12,87,15,16);
        l.stream().forEach(n->System.out.println(n+'\n'));

        Integer[] arr=l.stream().filter(n->n%2==0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr));


        int sum = l.stream().reduce(0,Integer::sum);
        System.out.println(sum);

        Optional<Integer> min = l.stream().min(Integer::compareTo);
        min.ifPresent(n->System.out.println(n));

        Optional<Integer> max = l.stream().max(Integer::compareTo);
        max.ifPresent(n->System.out.println("max: " + n));
    }
}
