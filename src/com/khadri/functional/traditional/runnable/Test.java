package com.khadri.functional.traditional.runnable;

public class Test {

	public static void main(String[] args) {
		Runnable runnable = new MyThread();
		Thread thread = new Thread(runnable);
		thread.start();

	}

}
