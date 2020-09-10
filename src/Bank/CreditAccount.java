package Bank;

public class CreditAccount extends BankAccount {
    private int rewards;

    public CreditAccount(int accountNum, int balance, String owner) {
        super(accountNum, balance, owner, "Credit");
        this.rewards = rewards;
    }

    public void applyRewards() {

    }
}
