package com.TNSIF.ComparotorAndComparable;

import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student  that) {
        return (this.age > that.age) ? 1 : -1;
    }
    
}
public class Acomparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter number of students: ");
    int n = sc.nextInt();

    Comparator<Student> co = (Student s1, Student s2) -> {
            return (s1.age > s2.age) ? 1 : -1;
        };
    

    ArrayList<Student> l = new ArrayList<>();
    
    for (int i = 0; i < n; i++) {
            Student s = new Student();

            System.out.print("Enter name: ");
            s.name = sc.next();

            System.out.print("Enter age: ");
            s.age = sc.nextInt();

            l.add(s);
        }

    Collections.sort(l);

    System.out.println("\nSorted Students:");
    System.out.println(l);
    }
}
