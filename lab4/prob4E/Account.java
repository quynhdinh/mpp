package prob4E;

public abstract class Account {
    private String accountID;
    private double balance;

    Account(String accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

    abstract double computeUpdatedBalance();

    public double getBalance() {
        return balance;
    }

    public String getAccountID() {
        return accountID;
    }
}