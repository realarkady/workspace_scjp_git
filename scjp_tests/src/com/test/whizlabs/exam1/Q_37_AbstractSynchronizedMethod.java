package com.test.whizlabs.exam1;

public abstract class Q_37_AbstractSynchronizedMethod {
	final void f() {
	}
	
	//compiler error: abstract methods cannot be synchronized!
	//abstract synchronized void g();

	static void h() {
	}

	Q_37_AbstractSynchronizedMethod() {
	}

	public static void main(String[] args) {
		Q_37_AbstractSynchronizedMethod obj;
	}
}