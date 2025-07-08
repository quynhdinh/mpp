package lab11.startupCodeLab11Part2.prob7;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
		// expected output: [0, -1, -2, -3, -4, 4, -5, 5]
		ordering1(intList);
		List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
		// expected output: [cba, fie, doe, efg, set]
		ordering2(stringList);

	}

	// Orders the integers according to this pattern:
	// 0, -1, 1, -2, 2, -3, 3, . . .
	// Using this ordering, this method sorts the list as part of
	// a stream pipeline, and prints to the console
	public static void ordering1(List<Integer> list) {
		List<Integer> sorted = list.stream().sorted((o1, o2) -> {
			if(Math.abs(o1) == Math.abs(o2)) return o1 - o2;
			return Math.abs(o1) - Math.abs(o2);
		}).toList();
		System.out.println(sorted);
	}

	// Orders words by first reversing each and comparing
	// in the usual way. So
	// cba precedes bed
	// since
	// cba.reverse() precedes bed.reverse()
	// in the usual ordering
	// Using this ordering, this method sorts the list as part of
	// a stream pipeline, and prints to the console
	public static void ordering2(List<String> words) {
		List<String> sorted = words.stream().sorted((o1, o2) -> {
			return new StringBuilder(o1).reverse().toString().compareTo(new StringBuilder(o2).reverse().toString());
		}).toList();
		System.out.println(sorted);
	}

}
