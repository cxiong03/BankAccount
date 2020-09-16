package com.codewithchang;

import Bank.CheckingAccount;
import Bank.SavingsAccount;
import Bank.DebitCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CheckingAccount myCheck = new CheckingAccount(1234, 3500, "Calvino");
        SavingsAccount myAcct = new SavingsAccount(333, 5000, "Chang", 5);
        SavingsAccount savings2 = new SavingsAccount(5430, 4700, "Cole", 3);
//        System.out.println(myAcct.getDetails());
        myAcct.withdraw(100);
//        System.out.println(myAcct.getDetails());
        myAcct.deposit(50);
        System.out.println(myCheck.getDetails());
        myCheck.deposit(200);
        myCheck.withdraw(500);
        System.out.println(myCheck.getDetails());
        myAcct.applyInterest();
//        System.out.println(myAcct.getDetails());
        DebitCard myCard = new DebitCard("1234 1234 1234 1133", "1234", "233", "Chang", myCheck,
                new ArrayList<SavingsAccount>(Arrays.asList(myAcct, savings2))
                );
        System.out.println(myCheck.getDetails());
        System.out.println(myCard.charge(50, "1234") ? "Approved" : "Declined");
        System.out.println(myCheck.getDetails());
        System.out.println(myCard.charge(200, "3218") ? "Approved" : "Declined");
        System.out.println(myCheck.getDetails());
    }
}
