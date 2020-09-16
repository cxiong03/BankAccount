package com.codewithchang;

import Bank.CheckingAccount;
import Bank.SavingsAccount;
import Bank.DebitCard;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CheckingAccount myCheck = new CheckingAccount(1234, 5000, "Calvino");
        SavingsAccount myAcct = new SavingsAccount(333, 5000, "Chang", 5);
        SavingsAccount savings2 = new SavingsAccount(5430, 4700, "Cole", 3);
         System.out.println(myAcct.getDetails());
        myAcct.withdraw(100);
        System.out.println(myAcct.getDetails());
        myAcct.deposit(300);
        System.out.println(myAcct.getDetails());
        System.out.println(myCheck.getDetails());
        myCheck.deposit(200);
        myCheck.withdraw(500);
        System.out.println(myCheck.getDetails());
        myAcct.applyInterest();
        System.out.println(myAcct.getDetails());
        List<SavingsAccount> savingslist = new ArrayList<SavingsAccount>();
        savingslist.add(myAcct);
        savingslist.add(savings2);
        DebitCard myCard = new DebitCard("1234 1234 1234 1133", "1234", "233", "Chang", myCheck,
                new ArrayList<SavingsAccount>(Arrays.asList(myAcct, savings2))
        );
    }
}
