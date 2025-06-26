package prob4E;

public class CheckingAccount extends Account{
    private double monthlyFee;
    public CheckingAccount(String accountID, double balance, double monthlyFee) {
        super(accountID, balance);
        this.monthlyFee = monthlyFee;
    }

    public CheckingAccount() {
        this("", 0, 0);
    }

    @Override
    double computeUpdatedBalance() {
        return getBalance() - monthlyFee;
    }
    
}
