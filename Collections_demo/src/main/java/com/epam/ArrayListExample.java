package com.epam;

import java.util.ArrayList;

public class ArrayListExample {
	static ArrayList l = new ArrayList();
	public static ArrayList demo() {
		l.add("A");
		l.add(10);
		l.add(3.14);
		l.remove(2);
		l.add(2, null);
		return l;
	}

}
