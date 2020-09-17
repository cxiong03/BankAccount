package BankTools;

import Bank.CheckingAccount;
import Bank.SavingsAccount;

import java.util.List;

public class DebitCard {
    private String pin;
    private CheckingAccount primary;
    private String cvv;
    private String cardOwner;
    private String cardNum;
    private List<SavingsAccount> atmAccounts;

    public DebitCard(String cardNum, String pin, String cvv, String cardOwner, CheckingAccount primary, List atmAccounts) {
        this.cardNum = cardNum;
        this.pin = pin;
        this.cvv = cvv;
        this.cardOwner = cardOwner;
        this.primary = primary;
        this.atmAccounts = atmAccounts;
    }

    public Boolean charge(int amt, String pin) {
        if (this.pin == pin && primary.getBalance() >= amt) {
            primary.withdraw(amt);
            return true;
        }
        return false;
    }
}
