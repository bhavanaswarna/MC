package com.epam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CaluculatorTest {
	Caluculator caluculator;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before all the tc");
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After all tc");
	}
	
	@BeforeEach
	void beforeEach() {
		caluculator = new Caluculator();
	}
	@AfterEach
	void afterEach() {
		System.out.println("After All is executed");
	}
	
	@Test
	@Disabled
	@DisplayName("Testing add method")
	void testAdd() {
		int expected = 4;
		int actual = caluculator.add(1, 3);
		assertEquals(expected,actual);
	}
	
	@Test
	void testSub() {
		int expected = 2;
		int actual = caluculator.sub(5, 3);
		assertEquals(expected,actual);
	}

}
