package lab11.startupCodeLab11Part1.prob3;

import java.util.stream.Stream;

public class PrimeStream {
    
    private static final Stream<Integer> createPrimesStream() {
        return Stream.iterate(2, i -> getNextPrime(i + 1));
    }

    private static int getNextPrime(int start) {
        while (!isPrime(start)) {
            start++;
        }
        return start;
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(10);
        System.out.println("====");
        ps.printFirstNPrimes(5);
    }
    
    void printFirstNPrimes(long n){
        createPrimesStream().limit(n).forEach(System.out::println);
    }
}