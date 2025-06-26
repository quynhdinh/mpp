package prob4C;

import java.time.LocalDate;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Employee emp1 = new Hourly("1", 7.5, 10);
        Employee emp2 = new Salaried("2", 7500);
        Employee emp3 = new Commissioned(List.of(new Order(1, LocalDate.of(2025, 5, 26), 100)), "3", 8600, 0.1);
        List<Employee> employees = List.of(emp1, emp2, emp3);
        for (Employee employee : employees) {
            Paycheck paycheck = employee.calcCompensation(6, 2025);
            System.out.println(employee);
            paycheck.print();
        }
    }
}