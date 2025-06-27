package lab5.prob4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustOrderFactory {

    public static CustomerOrder create(String name, LocalDate orderDate, List<List<String>> itemNamesList) {
        List<Order> orders = new ArrayList<>();
        for (List<String> itemNames : itemNamesList) {
            List<Item> items = new ArrayList<>();
            for (String item : itemNames)
                items.add(new Item(item));
            orders.add(new Order(orderDate, items));
        }
        return new CustomerOrderImpl(new Customer(name, orders), orders);
    }
}