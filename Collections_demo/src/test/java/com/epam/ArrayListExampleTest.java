package com.epam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ArrayListExampleTest {

	@Test
	void test() {
		ArrayListExample al  = new ArrayListExample();
		ArrayList actual = new ArrayList();
		actual.add("A");
		actual.add(10);
		actual.add(null);
		
		assertEquals(actual, al.demo());
				
	}

}
