package com.khadri.modern.functional;

public class Test {

	public static void main(String[] args) {
		System.out.println("added");
		FunctionalInterf1 interf1 = () -> {
			System.out.println("Hello Functional Interface Implementation");
		};
		
		interf1.m1();

	}
}
