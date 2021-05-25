package com.epam;

class Parent {
	int i = 12;
	public int j = 11;
	protected int k = 33;
	private int l = 99;
	void print() {
		System.out.println("the value of i in parent class is :"+i);
		System.out.println("the value of j in parent class is :"+j);
		System.out.println("the value of k in parent class is :"+k);
		System.out.println("the value of l in parent class is :"+l);
	}
}

class Child  extends Parent{
	void print1() {
		System.out.println("the value of i in derived class is :"+i);
		System.out.println("the value of j in derived class is :"+j);
		System.out.println("the value of k in derived class is :"+k);
		System.out.println("the value of l will not be printed as it is private type");
	}
}

public class AccessModifiersInInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.print();
		System.out.println();
		c.print1();
	}
}
