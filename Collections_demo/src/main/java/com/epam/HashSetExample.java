package com.epam;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Hello");
		hashSet.add("Hi");
		hashSet.add("Bhavana");
		hashSet.add("Swarna");
		System.out.println("Searching elements:");
		boolean ans = hashSet.contains("hi");
		if(ans) {
			System.out.println("contains 'hi'");
		} else {
			System.out.println("does not contains 'hi'");
		}
		System.out.println("Elements before sorting:");
		for(String s:hashSet) {
			System.out.println(s);
		}
		System.out.println("Sorting by converting into treeSet");
		TreeSet<String> treeSet = new TreeSet<String>(hashSet);
		Iterator<String> itr = treeSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
