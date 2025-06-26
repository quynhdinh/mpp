package prob4C;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {
    private List<Order> orders;
    private double baseSalary;
    private double commissioned;

    public Commissioned(List<Order> orders, String empID, double baseSalary, double commissioned){
        super(empID);
        this.orders = orders;
        this.baseSalary = baseSalary;
        this.commissioned = commissioned;
    }

    @Override
    double calcGrossPay(int month, int year) {
        double total = 0;
        for (Order order : orders)
            if (isFromLastMonth(month, year, order.getOrderDate()))
                total += (order.getOrderAmount() * commissioned);
        return baseSalary + total;
    }

    private boolean isFromLastMonth(int month, int year, LocalDate date) {
        LocalDate now = LocalDate.of(year, month, 1);
        LocalDate lastMonthDate = now.minusMonths(1).withDayOfMonth(1);
        return date.isBefore(now.withDayOfMonth(1))
                && date.isAfter(lastMonthDate);
    }
}