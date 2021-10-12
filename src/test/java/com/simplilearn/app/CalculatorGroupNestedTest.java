package com.simplilearn.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class CalculatorGroupNestedTest {

	Calculator calc;

	@BeforeEach
	public void setUp() {
		calc = new Calculator();
	}

	@AfterEach
	public void cleanUp() {
		calc = null;
	}
	
	@Nested
	@DisplayName("Addition Group")
	class Add {
		@Test
		@DisplayName("Test Addition : positive numbers")
		public void testAdd() {
			double actual = calc.add(300, 100);
			double expected = 400.0;
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Test Addition : negative numbers")
		public void testAddNegative() {
			double actual = calc.add(-300, -100);
			double expected = -400.0;
			Assertions.assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("Test Addition : postive & negative numbers")
		public void testAddPositiveNegative() {
			double actual = calc.add(300, -100);
			double expected = 200.0;
			Assertions.assertEquals(expected, actual);
		}
	}
	
	@Nested
	@DisplayName("Substraction Group")
	class Sub {
		
		// sub method should take positive value
		@Test
		@DisplayName("Test Substraction : postive numbers")
		public void testSubPositive() {
			double actual = calc.sub(300, 100);
			double expected = 200.0;
			Assertions.assertEquals(expected, actual);
		}
		
		// first value greater then second value  else return zero(no negative value).
		@Test
		@DisplayName("Test Substraction : postive numbers")
		public void testSubPositiveFirstHigher() {
			double actual = calc.sub(100, 300);
			double expected = 0.0;
			Assertions.assertEquals(expected, actual);
		}
		
		// test negative
		@Test
		@DisplayName("Test Substraction : negative numbers")
		public void testSubNegative() {
			double actual = calc.sub(-100, -300);
			double expected = 0.0;
			Assertions.assertEquals(expected, actual);
		}
	}
}

