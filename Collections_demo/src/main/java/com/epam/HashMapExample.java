package com.epam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		hashMap.put(1, "Bhavana");
		hashMap.put(4, "Swarna");
		hashMap.put(3, "Intern");
		System.out.println("Searching an element using 'containsValue'");
		boolean ans = hashMap.containsValue("Intern");
		if(ans) {
			System.out.println("Contains a value 'Intern'");
		} else {
			System.out.println(" Does not contains a value 'Intern'");
		}
		System.out.println("The value at key 1 is "+hashMap.get(1));
		TreeMap<Integer,String> treeSet = new TreeMap<Integer,String>(hashMap);
		System.out.println("Sorting values using TreeMap");
		Iterator itr = treeSet.values().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
