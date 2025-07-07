package lab10.prob4;

import java.util.List;

public class Main {
    public int countWords(List<String> words, char c, char d, int len) {
        return (int) words
                .stream()
                .filter(x -> x.length() == len)
                .filter(x -> x.indexOf(c) >= 0 && x.indexOf(d) == -1)
                .count();
    }

    public static void main(String[] args) {
        Main main = new Main();
        List<String> words = List.of("apply", "banana", "cherry", "date");
        int count = main.countWords(words, 'a', 'e', 5);
        System.out.println("Count: " + count);
    }
}
