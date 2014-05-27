package com.test.whizlabs.exam1;

class A {
	int x = 5;
}

class B extends A {
	int x = 6;
}

public class Q_34_CovariantTest {
	
	public A getObject() {
		return new A();
	}
	
	public static void main(String[] args) {
		Q_34_CovariantTest c1 = new SubCovariantTest();
		System.out.println(c1.getObject().x);
	}
}

class SubCovariantTest extends Q_34_CovariantTest {
	public B getObject() {
		return new B();
	}
}