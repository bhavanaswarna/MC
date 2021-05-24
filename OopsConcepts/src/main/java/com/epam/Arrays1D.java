package com.epam;

import java.util.Scanner;

public class Arrays1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements");
		for(int i = 0; i < 6;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("the elements are");
		for(int i = 0; i < 6;i++) {
			System.out.println(arr[i]);
		}
		arr[5] = 66;
		System.out.println("the elements after changes are");
		for(int i = 0; i < 6;i++) {
			System.out.println(arr[i]);
		}

	}

}
