package lab11.startupCodeLab11Part2.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> intStream = Stream.of(2, 4, 5, 2);
        IntSummaryStatistics stats = intStream.collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
    }
}