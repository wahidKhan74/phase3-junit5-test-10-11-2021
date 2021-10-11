package com.simplilearn.app;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidatorTest {
	
	Validator validator ;
	
	@BeforeEach
	public void setUp() {
		validator= new Validator();
	}
	
	@Test
	@DisplayName("Age validator : positive number")
	public void testAge() {
		assertEquals(true, validator.ageValidate(35));
		assertTrue(validator.ageValidate(35));
	}
	
	@Test
	@DisplayName("Age validator : negative number")
	public void testAgeNegative() {
		assertEquals(false, validator.ageValidate(-35));
		assertFalse(validator.ageValidate(-35));
	}
	
	@Test
	@DisplayName("Input validator : Not null or empty")
	public void testInputNotNull() {
		assertEquals(false, validator.isEmpty("John Smith"));
		assertFalse(validator.isEmpty("John Smith"));
	}
	
	@Test
	@DisplayName("Input validator : Null or empty")
	public void testInputNull() {
		assertEquals(true, validator.isEmpty(""));
		assertTrue(validator.isEmpty(""));
		assertEquals(true, validator.isEmpty(null));
		assertTrue(validator.isEmpty(null));
	}
	
	@Test
	@DisplayName("Input combine : not Null or empty")
	public void testCombine() {
		assertEquals("John Smith", validator.combine("John", "Smith"));
		assertNotNull(validator.combine("John", "Smith"));
		
		assertNull(validator.combine("", ""));
	}

}
