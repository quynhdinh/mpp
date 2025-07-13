package lab13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static double sum(Collection<? extends Number> nums) {
        double s = 0.0;
        for(Number num : nums) s += num.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>(); 
        objs.add(1);        // Integer
        objs.add("objs");
        List<? super Integer> ints = objs;
        ints.add(3);
        // fix it
        double total = sum(ints);
        // System.out.println("Sum: " + total);
        // does it compile?
    }
}
