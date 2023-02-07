package com.khadri.functional.traditional.collable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	public static void main(String[] args) throws Exception {

		MyCallable callable = new MyCallable(100, 300);

		ExecutorService service = Executors.newFixedThreadPool(2);
		Future<Double> future = service.submit(callable);
		
		System.out.println("Result : "+future.get());
		
	}
}
