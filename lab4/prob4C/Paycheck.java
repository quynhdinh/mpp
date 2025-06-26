package prob4C;

public final class Paycheck {
    double grossPay;
    double fica;
    double state;
    double local;
    double medicare;
    double socialSecurity;

    public Paycheck(double grossPay, double fica, double state, double local, double medicare, double socialSecurity) {
        this.grossPay = grossPay;
        this.fica = fica;
        this.state = state;
        this.medicare = medicare;
        this.socialSecurity = socialSecurity;
    }

    void print() {
        System.out.println("=====");
        System.out.printf("Gross: %s\n", grossPay);
        System.out.printf("FICA: %s\n", fica);
        System.out.printf("State: %s\n", state);
        System.out.printf("Local: %s\n", local);
        System.out.printf("Medicare: %s\n", medicare);
        System.out.printf("SocialSecurity: %s\n", socialSecurity);
        System.out.println("=====");
    }

    double getNetPay() {
        return grossPay - fica - state - local - medicare - socialSecurity;
    }
}