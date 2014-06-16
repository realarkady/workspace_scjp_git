package com.test.whizlabs.exam2;

public class Q_35_Boolean_default_null {
	Boolean[] bool = new Boolean[5];

	public static void main(String[] args) {
		new Q_35_Boolean_default_null().myMethod();
	}

	public void myMethod() {
		if (bool[1] == true) {
			System.out.println("It's true");
		} else {
			System.out.println("It's false");
		}
	}
}