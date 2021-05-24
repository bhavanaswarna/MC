package com.epam;

class Adder{  
	static int add(int a, int b){return a+b;}  
	static double add(double a, double b){return a+b;}  
}  

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(231,11));  
		System.out.println(Adder.add(121.3,12.6));  

	}

}
