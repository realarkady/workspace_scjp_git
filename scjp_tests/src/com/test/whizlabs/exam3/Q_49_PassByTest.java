package com.test.whizlabs.exam3;

class PassTest {
	int i = 3;
}

public class Q_49_PassByTest {
	public static void xx(PassTest p) {
		p.i = 10;
	}

	public static void yy(PassTest p) {
		p = new PassTest();
	}

	public static void main(String[] args) {
		PassTest passTest = new PassTest();
		xx(passTest);
		System.out.println(passTest.i);
		yy(passTest);
		System.out.println(passTest.i);
		
		int a = -5;
		int b = -2;
		System.out.println(a % b);
		
	}
}