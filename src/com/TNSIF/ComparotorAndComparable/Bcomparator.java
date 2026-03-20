package com.TNSIF.ComparotorAndComparable;

import java.util.Comparator;
import java.util.*;

public class Bcomparator {
    public static void main(String[] args) {
        Comparator<Integer> co = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return (a % 10 > b % 10) ? 1 : -1;
            }
        };

        List<Integer> l = new ArrayList<>(
                List.of(23, 45, 12, 67, 34, 89, 894, 564, 321, 9, 16, 3, 6, 131, 464, 313, 6, 161, 5416231, 1297));
        Collections.sort(l, co);
        System.out.println(l);
    }
}
