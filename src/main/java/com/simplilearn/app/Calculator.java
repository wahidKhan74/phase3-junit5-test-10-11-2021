package com.simplilearn.app;

public class Calculator {
	
	public double add(int num1 , int num2) {
		return num1 + num2;
	}
	
	public double sub(int num1 , int num2) {
		if(num1>0 && num2>0 && num1>num2) {
			return num1 - num2;
		}
		return 0;
	}


}
