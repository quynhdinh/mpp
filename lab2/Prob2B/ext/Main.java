package lab2.Prob2B.ext;

import lab2.Prob2B.Order;
import lab2.Prob2B.OrderLine;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1);
        OrderLine orderLine = new OrderLine();
        order.addOrderLine(orderLine);
        assert orderLine.getOrder() == order : "OrderLine should reference the Order it belongs to";
        assert order.getOrderLines().contains(orderLine) : "Order should contain the OrderLine";
    }
}