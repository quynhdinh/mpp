package lab9.labs.prob2;

public record Addition(Expr x, Expr y) implements Expr {
    public int compute() {
        return x.compute() + y.compute();
    }
}