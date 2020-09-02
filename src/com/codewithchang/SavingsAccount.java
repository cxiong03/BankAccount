package com.codewithchang;

public class SavingsAccount extends BankAccount {
    public SavingsAccount (int accountNum, int balance, String owner) {
        super(accountNum, balance, owner, "Savings");
    }
}
