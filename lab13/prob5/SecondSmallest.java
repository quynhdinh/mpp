import java.util.List;
import java.util.Arrays;
public class SecondSmallest {
    public static <T extends Comparable<? super T>> T secondSmallest(List<T> list) {
        if (list.size() < 2) {
            throw new IllegalArgumentException("List must contain at least two elements");
        }
        T smallest = list.get(0);
        T secondSmallest = null;
        for (T item : list) {
            if (item.compareTo(smallest) < 0) {
                secondSmallest = smallest;
                smallest = item;
            } else if (secondSmallest == null || item.compareTo(secondSmallest) < 0) {
                if (!item.equals(smallest)) {
                    secondSmallest = item;
                }
            }
        }
        if (secondSmallest == null) {
            throw new IllegalArgumentException("No second smallest element found");
        }
        return secondSmallest;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 4);
        Integer secondSmallest = secondSmallest(numbers);
        System.out.println("Second smallest number is: " + secondSmallest);
    }
}
