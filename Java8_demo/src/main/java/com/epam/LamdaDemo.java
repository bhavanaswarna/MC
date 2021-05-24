package com.epam;

import java.util.Scanner;

public class LamdaDemo {

	public static void main(String[] args) {
		myLamda Odd = (int a,int b) -> {
			
			for(int i = a; i <=b ;i++) {
				if(i % 2 != 0) {
					System.out.println(i);
				}
			}
			
		};
		Odd.odd(1, 20);

	}

}

interface myLamda {
	void odd(int a, int b);
}