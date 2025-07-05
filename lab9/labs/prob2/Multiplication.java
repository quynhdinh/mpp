package lab9.labs.prob2;

public record Multiplication(Expr x, Expr y) implements Expr {
    @Override
    public int compute() {
        return x.compute() * y.compute();
    }
}