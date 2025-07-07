package lab9.labs.prob2;

public class Main {
    public static void main(String[] args) {
        Expr add = new Addition(new Constant(2), new Constant(3));
        Expr m = new Multiplication(new Constant(4), add);
        System.out.println("Using eval(): " + eval(m));
    }
    public static int eval(Expr expr){
        if (expr instanceof Constant) {
            return ((Constant) expr).x();
        } else if (expr instanceof Addition) {
            Addition add = (Addition) expr;
            return eval(add.x()) + eval(add.y());
        } else if (expr instanceof Multiplication) {
            Multiplication mult = (Multiplication) expr;
            return eval(mult.x()) * eval(mult.y());
        }
        throw new IllegalArgumentException("Unknown expression type");
    }
}