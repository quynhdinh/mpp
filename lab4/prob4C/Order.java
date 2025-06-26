package prob4C;

import java.time.LocalDate;

public final class Order {
    private int orderNo;
    private LocalDate orderDate;
    private int orderAmount;

    public Order(int orderNo, LocalDate date, int orderAmount) {
        this.orderNo = orderNo;
        this.orderDate = date;
        this.orderAmount = orderAmount;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getOrderNo() {
        return orderNo;
    }
}