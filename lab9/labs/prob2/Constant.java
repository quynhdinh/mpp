package lab9.labs.prob2;

public record Constant(int x) implements Expr{
    @Override
    public int compute() {
        return x;
    }
}