package com.epam;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
	public static void main(String args[]) {
		ArrayList l = new ArrayList();
		for(int i = 0; i < 10;i++) {
			l.add(i);
		}
		Iterator it = l.iterator();
		while(it.hasNext()) {
			Integer in = (Integer)it.next();
			if(in % 2 != 0) {
				it.remove();
			}
		}
		System.out.println(l);
		
	}
	

}
