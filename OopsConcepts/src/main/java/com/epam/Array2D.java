package com.epam;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("printing the array");
		for(int i = 0; i < 3;i++) {
			for(int j = 0; j < 3;j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
