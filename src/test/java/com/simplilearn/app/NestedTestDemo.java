package com.simplilearn.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Outer Test Class")
public class NestedTestDemo {
	
	@BeforeEach
	void setUp() {
		System.out.println("** Outer Test Before each **");
	}
	
	@AfterEach
	void tearDown() {
		System.out.println("** Outer Test After each **");
	}
	
	@Test
	void testOuter() {
		System.out.println("-- Outer Test Completed !---");
	}

	//nested test
	@Nested
	@DisplayName("Inner Test Group")
	class InnerTest {
			
		@Test
		void testOne() {
			System.out.println("-- Test One Completed !---");
		}
		
		@Test
		void testTwo() {
			System.out.println("-- Test Two Completed !---");
		}
	}
}
