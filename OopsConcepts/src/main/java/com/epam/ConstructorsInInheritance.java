package com.epam;

class Base {
	Base() {
		System.out.println("This ia a base class constructor");
	}
	Base(int x) {
		System.out.println("base class constructor with a parameter and value of x is:"+x);
	}
}

class Derived extends Base {
	Derived() {
		System.out.println("This is a derived class constructor");
	}
	Derived(int x, int y) {
		super(x);
		System.out.println("derived class with two parameters and  value of y is :"+y);
	}
}

public class ConstructorsInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived d = new Derived();
		System.out.println("\n");
		Derived d1 = new Derived(22,44);
	}

}
