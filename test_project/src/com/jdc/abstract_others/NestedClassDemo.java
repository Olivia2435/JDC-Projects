package com.jdc.abstract_others;

public class NestedClassDemo {
	public static void main(String[] args) {
		System.out.println(OuterClass.staticVariable);
		System.out.println(new OuterClass().outerInstanceVariable);
		
		//For static class
		OuterClass.StaticNestedClass.display();
		System.out.println();
		
		//for non-static class
		OuterClass.NonStaticInnerClass inner = new OuterClass().new NonStaticInnerClass();
		inner.display();
		System.out.println();
		
		//local class
		OuterClass outer = new OuterClass();
		outer.myLocal();
		
	}

}
