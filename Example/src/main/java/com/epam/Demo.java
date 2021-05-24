package com.epam;

import java.util.*;
import java.lang.reflect.Array;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<People> persons = new ArrayList<People>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num of persons");
		int n = sc.nextInt();
		while(n !=0) {
			System.out.println("Enter first name");
			String firstName = sc.next();
			System.out.println("Enter last name");
			String lastName = sc.next();
			System.out.println("enter age");
			int age = sc.nextInt();
			People people = new People(firstName,lastName,age);
			persons.add(people);
			n--;
		}
		Collections.sort(persons,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("Printing all the elements in set");
		for(People p:persons) {
			System.out.println(p);
		}
		System.out.println("Printing only those elements lastname starting with s");
		for(People p:persons) {
			if(p.getLastName().startsWith("s")) {
				System.out.println(p);
			}
		}
	}
	
}
