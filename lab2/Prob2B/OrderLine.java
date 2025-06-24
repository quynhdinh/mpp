package lab2.Prob2B;

public class OrderLine {
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "order=" + order +
                '}';
    }
}
