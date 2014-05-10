package com.testing;

public class Main {
	
	public Main() {	}
	
	public static void main(String[] args) {
		System.out.println("--- Start ---");
		
		int myVar;
		BClass ibCclass = new CClass();
		ibCclass.iMethod();
		
		System.out.println((new Integer(5)) == (new Integer(5)));
		System.out.println("--- Finish ---");
	}
	
}
