package com.jdc.abstract_others;

public class OuterClass {
	
	static int staticVariable = 10;
	int outerInstanceVariable = 20;
	
	//static nested class
	static class StaticNestedClass{
		static void display() {
			System.out.println("Static Nested Class");
			System.out.println("Outer Static Variable ::" + staticVariable);
		}
	}
	
	// non-static inner class
	class NonStaticInnerClass{
		void display() {
			System.out.println("Non static Inner Class");
			System.out.println("Outer NonStatic Variable ::"+ outerInstanceVariable);
			System.out.println("Outer Static Varible ::" + staticVariable);
		}
	}
	
	// local class
	void myLocal() {
		class LocalInnerClass{
			void display() {
				System.out.println("Hello from Local Inner Class.");
			}
		}
		LocalInnerClass local = new LocalInnerClass();
		local.display();
	}

}
