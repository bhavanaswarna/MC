package com.epam;

import java.util.*;

public class LinkedListExampple {
	public LinkedList demo1() {
		LinkedList l = new LinkedList();
		l.add(1);
		l.addFirst("hi");
		l.add(1, 8);
		l.addLast("Hello");
		l.addAll(l);
		System.out.println(l);
		return l;
		
	}
}
