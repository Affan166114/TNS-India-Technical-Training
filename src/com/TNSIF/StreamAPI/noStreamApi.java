package com.TNSIF.StreamAPI;
import java.util.*;

public class noStreamApi {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,78,9,10);
        List<Integer> even = new ArrayList<>();
        for (Integer integer : l) {
            if (integer % 2 == 0) {
                even.add(integer);
            }
        }
        System.out.println(even);
    }
}
