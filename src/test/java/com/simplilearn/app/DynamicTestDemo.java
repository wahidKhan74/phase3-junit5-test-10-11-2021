package com.simplilearn.app;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestDemo {
	
	@TestFactory
	DynamicTest dynamicTest() {
		return DynamicTest.dynamicTest("Test One Method", ()-> {
			Assertions.assertTrue(true);		
		});		
	}
	
	
	@TestFactory
	DynamicTest dynamicTest2() {
		return DynamicTest.dynamicTest("Test Two Method", ()-> {
			Assertions.assertFalse(false);		
		});		
	}

	@TestFactory
	Collection<DynamicTest> multipleTestCollection() {
		return Arrays.asList(
				// test one
				DynamicTest.dynamicTest("Collection Test One Method", ()-> {
					Assertions.assertTrue(true);		
				}),
				DynamicTest.dynamicTest("Collection Test Two Method", ()-> {
					Assertions.assertTrue(300>100);		
				})
		);
				
					
	}
}
