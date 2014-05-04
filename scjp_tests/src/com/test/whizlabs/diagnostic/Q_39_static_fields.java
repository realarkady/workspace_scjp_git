package com.test.whizlabs.diagnostic;

public class Q_39_static_fields {

	public Q_39_static_fields() {	}
	
	static {
		int x= 5;
	}
	
	static int x, y;
	
	public static void main(String[] args) {
		x--;
		myMethod();
		System.out.println(x + y + ++x);
		System.out.println(""+x + y + ++x);
	}
	
	public static void myMethod() {
		y = x++ + ++x;
	}
	
}
