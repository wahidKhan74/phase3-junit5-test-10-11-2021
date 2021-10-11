package com.simplilearn.app;

public class Validator {
	
	// age validator
	public boolean ageValidate(int age) {
		if(age>18) {
			return true;
		}
		return false;
	}
	
	// input validator
	public boolean isEmpty(String input) {
		if(input!=null && input.length()>0) {
			return false;
		}
		return true;
	}
	
	// combine input
	public String combine(String firstName, String lastName) {
		if(isEmpty(firstName) && isEmpty(lastName)) {
			return null;
		}
		return firstName +" "+ lastName;
	}

}
