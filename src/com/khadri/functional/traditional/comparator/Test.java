package com.khadri.functional.traditional.comparator;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>(new ComparatorImpl());

		numbers.add(50);
		numbers.add(10);
		numbers.add(150);
		numbers.add(200);
		numbers.add(40);
		numbers.add(0);

		System.out.println(numbers);
	}
}
