package com.TNSIF.constructor;

class Employee{
    private int salary;
    private String Name;

    public Employee(int s, String n){
        salary=s;
        Name=n;
    }

    public  void setName(String n){
        Name=n;
    }
    public String getName(){
        return Name;
    }
    public void setSalary(int s){
        salary=s;
    }
    public int getSalary(){
        return salary;
    }
}

public class Constuct {
    public static void main(String[] args) {
        Employee e = new Employee(50000, "Syed Mohammad Affan");
        System.out.println("Employee Name: "+e.getName());
        System.out.println("Employee Salary: "+e.getSalary());
    }
}
