package lab11.startupCodeLab11Part2.prob10b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Bill", "Thomas", "Mary");
        String collect = stream.collect(Collectors.joining(","));
        System.out.println(collect);
    }
}