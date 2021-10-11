package com.simplilearn.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionTest {
	
	String firstName="John";
	String lastName=null;
	int age = 35;
	String[] family = {"Mike","David","Marry","William"};
	int[] numbers= {10,20,30};
	int[] values = {10,20,30};
	
	@Test
	@DisplayName("Test Assert Equal")
	public void testAssertEqual() {
		
		assertEquals(firstName, "John");
		assertEquals(age, 35);
		assertEquals(lastName, null);
		assertEquals(true, true);
//		assertEquals(true, false);
		assertArrayEquals(numbers, values);
	}
	
	@Test
	@DisplayName("Test Assert True and False")
	public void testAssertTrueAndFalse(){
		assertEquals(true, true);
		assertTrue(true);
		assertFalse(false);
		
		assertTrue(300>200);
		assertFalse(200>300);
	}
	
	@Test
	@DisplayName("Test Assert Null and Not Null")
	public void testAssertNullNotNull(){ 
		
		assertNull(null);
		assertNull(lastName);
		
		assertNotNull(firstName);
		assertNotNull(family);		
		assertNotNull(age);
	}

}
