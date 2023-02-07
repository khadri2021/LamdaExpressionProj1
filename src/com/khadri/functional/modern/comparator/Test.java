package com.khadri.functional.modern.comparator;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>((Integer o1, Integer o2) -> {
			return -o1.compareTo(o2);
		});

		numbers.add(50);
		numbers.add(10);
		numbers.add(150);
		numbers.add(200);
		numbers.add(40);
		numbers.add(0);

		System.out.println(numbers);
	}
}
