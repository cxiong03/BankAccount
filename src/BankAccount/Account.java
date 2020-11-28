package BankAccount;

public interface Account {
    // Anything inside the interface will be public or final
    public void withdraw(int amt);
    public void deposit(int amt);
    public String getOwner();
    public String getDetails();
    public int getBalance();
}
