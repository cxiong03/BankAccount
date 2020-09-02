package com.codewithchang;

public class BankAccount {
    private int accountNum;
    private String owner;
    private int balance;
    private String type;

    public BankAccount(int accountNum, int balance, String owner, String type) {
        this.accountNum = accountNum;
        this.balance = balance;
        this.owner = owner;
        this.type = type;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt, int accountNum) {
        if (balance >= amt && this.accountNum == accountNum) {
        balance -= amt;
        return;
    }
        return;

    public String getDetails() {
        return type + "Owner: " + owner + "\tAccount Number: " + accountNum + "\tBalance: " + balance;
    }
}
