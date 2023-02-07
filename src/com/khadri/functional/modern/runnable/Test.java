package com.khadri.functional.modern.runnable;

public class Test {

	public static void main(String[] args) {

		Thread thread = new Thread(() -> {
			System.out.println("hello I am functional runnable");
		});
		thread.start();
	}

}
