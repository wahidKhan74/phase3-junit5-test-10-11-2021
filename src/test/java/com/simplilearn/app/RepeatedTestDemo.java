package com.simplilearn.app;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class RepeatedTestDemo {

	Calculator calc;
	
	@BeforeEach
	public void setUp() {
		calc = new Calculator();
	}

	@AfterEach
	public void cleanUp() {
		// calc = null;
	}

	@Test
	@DisplayName("Add Operation test")
	@RepeatedTest(4)
	public void testAdd() {
		Assertions.assertEquals(300, calc.add(100, 200), "100+200 should be equals to 300.");
	}
	
	
	@Test
	@DisplayName("Substraction Operation test")
	@RepeatedTest(value=4, name= "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
	public void testSub(TestInfo info) {
		Assertions.assertEquals(0.0, calc.sub(100, 200), "100-200 should be equals to 0.0.");
	}
	
	@Test
	@DisplayName("Substraction Operation test")
	@RepeatedTest(value=4,name = RepeatedTest.LONG_DISPLAY_NAME )
	public void testSub2(TestInfo info) {
		Assertions.assertEquals(0.0, calc.sub(100, 200), "100-200 should be equals to 0.0.");
	}
	@Test
	@DisplayName("Substraction Operation test")
	@RepeatedTest(value=4,name = RepeatedTest.SHORT_DISPLAY_NAME )
	public void testSub3(TestInfo info) {
		Assertions.assertEquals(0.0, calc.sub(100, 200), "100-200 should be equals to 0.0.");
	}
}
