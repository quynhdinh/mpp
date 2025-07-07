package lab9.labs.prob2;

public sealed interface Expr permits Addition, Constant, Multiplication {
    int compute();
}