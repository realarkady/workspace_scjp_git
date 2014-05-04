package com.test.whizlabs.diagnostic;

public class Q_21_covariant {
	public Q_21_covariant() {	}
	
	public static void main(String[] args) {
		First o = new Second();
		String s = (String) o.method1(); // compiler error if no cast
		System.out.println(s);
	}
}

class First {
	public First() { }
	
	public Object method1() {
		System.out.println("Calling super class method");
		return new String("Base");
	}
	
}

class Second extends First {
	public Second() { }
	
	public String method1() {
		System.out.println("Calling sub class method");
		return new String("Derived");
	}
}