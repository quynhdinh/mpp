package prob4E;

public class SavingsAccount extends Account {
    private double interestRate;
    public SavingsAccount(String accountID, double interestRate, double balance) {
        super(accountID, balance);
        this.interestRate = interestRate;
    }
    @Override
    double computeUpdatedBalance() {
        return getBalance() + interestRate * getBalance();
    }
}