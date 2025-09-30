package com.jdc.abstract_others;

public class AnnonymousInnerClassDemo {
	public static void main(String[] args) {
		var mc = new MyClass();
		mc.greet();
		
		var abs = new AbsClass() {
			@Override
			public void greet() {
				System.out.println("Hello, Annonymous Inner Class!!");
			}
		};
		abs.greet();
		
	}

}
abstract class AbsClass{
	public abstract void greet();
}

class MyClass extends AbsClass{
	@Override
	public void greet() {
		System.out.println("Hello World, I'm coming!!");
	}
}
