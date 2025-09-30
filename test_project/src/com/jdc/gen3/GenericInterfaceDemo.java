package com.jdc.gen3;

public class GenericInterfaceDemo {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box();
		b1.put(123);
		System.out.println("Intger Box :: " + b1.take());
	}

}
