package com.codewithchang;

public class Main {
    public static void main(String[] args) {
        BankAccount myAcct = new SavingsAccount(333, 5000, "Chang");
        System.out.println(myAcct.getDetails());
        myAcct.withdraw(100);
        System.out.println(myAcct.getDetails());
        myAcct.deposit(300);
        System.out.println(myAcct.getDetails());
    }
}
