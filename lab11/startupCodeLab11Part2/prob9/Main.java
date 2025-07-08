package lab11.startupCodeLab11Part2.prob9;

import java.util.stream.IntStream;

public class Main {
    static int square(int n){
        return n * n;
    }
    public static void printSquares(int num){
        IntStream stream = IntStream.iterate(1, i -> i + 1);
        stream.limit(num).forEach(n -> System.out.println(n * n));
    }
    public static void main(String[] args) {
        printSquares(4);
        printSquares(5);
    }
}
