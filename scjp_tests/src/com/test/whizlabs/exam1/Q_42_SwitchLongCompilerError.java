package com.test.whizlabs.exam1;

public class Q_42_SwitchLongCompilerError {

	public static void main(String[] args) throws MyException {
		//compilor error: Only these types are valid arguments for switch statement: 
		//byte, short, char, int, and enum constants
		
		// long val = 2;
		
		//fix: convert to some valid type
		int val = 2;
		switch (val) {
		default:
			System.out.println("default");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		}
	}
}