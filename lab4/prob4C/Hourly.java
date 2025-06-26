package prob4C;

public class Hourly extends Employee {
    private double hourlyWage;
    private int hoursPerWeek;

    public Hourly(String empID, double hourlyWage, int hoursPerWeek) {
        super(empID);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }
}