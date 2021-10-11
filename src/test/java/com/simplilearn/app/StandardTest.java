package com.simplilearn.app;

import javax.security.auth.login.FailedLoginException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Standard Test Annotations")
public class StandardTest {
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("** Before all test ! **");
	}
	@AfterAll
	public static void aftereAll() {
		System.out.println("** After all test ! **");
	}
	
	
	@BeforeEach()
	public void setUp() {
		System.out.println("-- Before each test ! --");
	}
	
	@AfterEach()
	public void cleanUp() {
		System.out.println("-- After each test ! --");
	}
	
	@Test
	@DisplayName("Test One : 1")
	public void testOne() {
		System.out.println("Test One !");
	}
	
	@Test
	@DisplayName("Test Two : 2")
	@Disabled
	public void testTwo() {
		System.out.println("Test Two !");
		Assertions.fail();
	}
	
	@Test
	@DisplayName("Test Three : 3")
	public void testThree() {
		System.out.println("Test Three !");
	}

}
