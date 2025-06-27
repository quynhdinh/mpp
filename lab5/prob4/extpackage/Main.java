package lab5.prob4.extpackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lab5.prob4.CustOrderFactory;
import lab5.prob4.CustomerOrder;

public class Main {
    public static void main(String[] args) {
        List<CustomerOrder> customerOrders = new ArrayList<>();
        List<List<String>> orders = List.of(List.of("Bag", "Knife"));
        List<List<String>> orders2 = List.of(List.of("Bike", "Chair"));
        CustomerOrder customerOrder = CustOrderFactory.create("Bob", LocalDate.now(), orders);
        customerOrders.add(customerOrder);
        customerOrder = CustOrderFactory.create("Yusef", LocalDate.now(), orders2);
        customerOrders.add(customerOrder);
        System.out.println(customerOrders.size());
    }
}