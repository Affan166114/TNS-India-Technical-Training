package com.TNSIF.encapsulation;

class BankAccount {
    private String AccountHolderName;
    private double balance;

    public BankAccount(String AccountHolderName, double balance) {
        this.AccountHolderName = AccountHolderName;
        this.balance = balance;
    }

    public String getHolderName() {
        return AccountHolderName;
    }

    public void setHolderName(String AccountHolderName) {
        this.AccountHolderName = AccountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Please ensure the amount must be greater than 0");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Syed Mohammad Affan", 100000.0);

        System.out.println("Current Account Holder Name is:" + acc.getHolderName());
        System.out.println("Current Balance is:" + acc.getBalance());

        acc.deposit(200000.0);
        System.out.println("Current Balance of " + acc.getHolderName() + " is:" + acc.getBalance());

        acc.withdraw(50000.0);
        System.out.println("Amount after withdrawal is:" + acc.getBalance());
    }
}
