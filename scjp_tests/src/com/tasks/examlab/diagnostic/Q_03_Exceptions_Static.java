package com.tasks.examlab.diagnostic;

class SuperClass {
	static void printMe() {
		System.out.print("super context ");
	}
}

public class Q_03_Exceptions_Static extends SuperClass {
	public static void printMe() throws ArithmeticException {
		System.out.print("sub context ");
	}

	public static void main(String argv[]) {
		SuperClass sc = new Q_03_Exceptions_Static();
		sc.printMe();
	}
}