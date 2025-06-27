package lab5.prob4;

import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    Customer(String name, List<Order> orders) {
        this.name = name;
        this.orders = orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }
}