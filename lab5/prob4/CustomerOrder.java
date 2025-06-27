package lab5.prob4;

import java.util.List;

public interface CustomerOrder {
    Customer getCustomer();

    List<Order> getOrder();
}