package com.codewithchang;

import Bank.CheckingAccount;
import Bank.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        CheckingAccount myCheck = new CheckingAccount(1234, 5000, "Calvino");
        SavingsAccount myAcct = new SavingsAccount(333, 5000, "Chang", 5);
         System.out.println(myAcct.getDetails());
        myAcct.withdraw(100);
        System.out.println(myAcct.getDetails());
        myAcct.deposit(300);
        System.out.println(myAcct.getDetails());
//        System.out.println(myCheck.getDetails());
//        myCheck.deposit(200);
//        myCheck.withdraw(500);
//        System.out.println(myCheck.getDetails());
        myAcct.applyInterest();
        System.out.println(myAcct.getDetails());
    }
}
