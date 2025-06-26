package prob4C;

public abstract class Employee {
    private String empID;

    public Employee(String empID){
        this.empID = empID;
    }

    abstract double calcGrossPay(int month, int year);

    public Paycheck calcCompensation(int month, int year) {
        double gross = calcGrossPay(month, year);
        return new Paycheck(gross,
                gross * Tax.FICA,
                gross * Tax.State,
                gross * Tax.Local,
                gross * Tax.Medicare,
                gross * Tax.SocialSecurity);
    }

    @Override
    public String toString() {
        return "[Employee: " + empID + "]";
    }
}
