package com.epam;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	@Test
	public void test() {
		Demo demo = new Demo();
		int expected = 2;
		int actual = demo.add(1, 1);
		assertEquals(expected,actual);
	}

}
