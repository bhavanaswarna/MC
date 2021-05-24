package com.epam;

public class GenericMethod {
	public static <E> void printElements(E[] elements) {
		for(E element : elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intElements = {1,2,3,4,5,6,7,8};
		String[] stringElements = {"one","two","three","four"};
		Character[] charElements = {'q','w','e'};
		printElements(intElements);
		printElements(stringElements);
		printElements(charElements);
	}

}
