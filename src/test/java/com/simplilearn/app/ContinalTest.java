package com.simplilearn.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class ContinalTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Test Run on Windows OS")
	@EnabledOnOs({OS.WINDOWS})
	void testOnWinodws() {
		System.out.println("This Test Run only On Winodws OS");
	}
	
	@Test
	@DisplayName("Test Run on Linux OS")
	@EnabledOnOs({OS.LINUX})
	void testOnLinux() {
		System.out.println("This Test Run only On Linux OS");
	}
	
	@Test
	@DisplayName("Test Run on other than Linux OS")
	@DisabledOnOs({OS.LINUX})
	void testDisOnLinux() {
		System.out.println("This Test Run other than  Linux OS");
	}
	
	@Test
	@DisplayName("Test Run On JRE 1.8")
	@EnabledOnJre(JRE.JAVA_8)
	public void testRunOnJRE8() {
		System.out.println("This test only runs with JRE 1.8");
	}
	
	@Test
	@DisplayName("Test Run On JRE 11")
	@EnabledOnJre(JRE.JAVA_11)
	public void testRunOnJRE11() {
		System.out.println("This test only runs with JRE 11");
	}
	
	@Test
	@DisplayName("Test on random number")
	@DisabledIf("Math.random() < 0.31415")
	public void testOnRandomNumber() {
		System.out.println("This may or may not execute.");
	}
}
