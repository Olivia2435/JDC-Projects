package com.jdc.abstract_others;

public class DiamondProblemDemo {
	public static void main(String[] args) {
		var obj = new ConcrteClass();
		obj.display();
	}

}
interface A{
	default void display() {
		System.out.println("From interface A");
	}
	
}
interface B{
	default void display() {
		System.out.println("From interface B");
	}
}
interface C extends A,B{
	@Override
	default void display() {
		A.super.display();
		//B.super.display();
		System.out.println("From interface C");
	}
}
class ConcrteClass implements C{
	@Override
	public void display() {
		C.super.display();
	}
}
