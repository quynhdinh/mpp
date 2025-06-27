package lab5.prob4;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private LocalDate orderDate;
    private List<Item> items;

    Order(LocalDate orderDate, List<Item> items) {
        this.orderDate = orderDate;
        this.items = items;
    }

    @Override
    public String toString() {
        return orderDate + ": " +
                items.toString();
    }
}