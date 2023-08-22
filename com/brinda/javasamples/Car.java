package com.brinda.javasamples;

public class Car extends Vehicle{
	
	private void run() {
		System.out.println("Cars are many types");
	}

	@Override public void size() {
		System.out.println("There are different size of cars");
	}
}
