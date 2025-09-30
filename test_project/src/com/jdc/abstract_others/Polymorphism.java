package com.jdc.abstract_others;

public class Polymorphism {
	public static void main(String[] args) {
		Animal a1 = new Dog();
		
		a1 = new Cat();
		a1.eat();
		a1 = new Tiger();
	}

}
class Animal{
	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal{
	void eat() {
		System.out.println("Dog is eating");
	}
}
class Cat extends Animal{
	void eat() {
		System.out.println("Cat is eating");
	}
}
class Tiger extends Animal{
	void eat() {
		System.out.println("Tiger is eating");
	}
}