package com.epam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class LinkedListExamppleTest {

	@Test
	void test() {
		LinkedListExampple linkedList = new LinkedListExampple();
		LinkedList actual = new LinkedList();
		actual.add(1);
		actual.addFirst("hi");
		actual.add(1, 8);
		actual.addLast("Hello");
		actual.addAll(actual);
		assertEquals(actual,linkedList.demo1());
	}

}
