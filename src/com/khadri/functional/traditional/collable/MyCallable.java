package com.khadri.functional.traditional.collable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Double> {

	private double a;
	private double b;

	public MyCallable(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public Double call() throws Exception {

		return a + b;
	}

}
