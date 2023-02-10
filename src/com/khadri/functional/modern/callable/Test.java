package com.khadri.functional.modern.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	public static void main(String[] args) throws Exception {

		System.out.println("Test-main");
		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Double> future = service.submit(() -> 100.00 + 300);

		System.out.println("Result : " + future.get());

	}
}
