package lab9.labs.prob2;

public class Main {
    public static void main(String[] args) {
        Expr add = new Addition(new Constant(2), new Constant(3));
        Expr m = new Multiplication(new Constant(4), add);
        System.out.println(m.compute());
    }
    int val(Expr expr){
        return expr.compute();
    }
}