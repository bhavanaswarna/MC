package com.epam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList();
		arrayList.add(22);
		arrayList.add(3);
		arrayList.add(43);
		arrayList.add(1);
		Collections.sort(arrayList);
		System.out.println("after sorting using sort in assending order");
		for(int i:arrayList) {
			System.out.println(i);
		}
		System.out.println("sorting in decending order");
		Collections.sort(arrayList, new ComparatorExample());
		for(int i:arrayList) {
			System.out.println(i);
		}
		System.out.println("Iterating elements :");
		ListIterator<Integer> itr = arrayList.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Searching elements");
		boolean ans = arrayList.contains(22);
		if(ans) {
			System.out.println("contains 22");
		} else {
			System.out.println("does not contains 22");
		}
	}
}
