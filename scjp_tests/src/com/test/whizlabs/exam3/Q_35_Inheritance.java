package com.test.whizlabs.exam3;

abstract class SuperTest {
	static int i = 10;
}

public class Q_35_Inheritance extends SuperTest implements Inter {
	final static int i;
	static {
		i = 9;
	}

	public void f() {
		System.out.println("i is " + i);
	}

	public static void main(String[] args) {
		Inter t = new Q_35_Inheritance();
		t.f();
		
	}
}

interface Inter {
	int i = 1;

	void f();
}
