package com.test.whizlabs.exam3;

class MyOuter {
	private class MyInner {
		private float f() {
			return 1.2F;
		}
	}

	MyInner getInner() {
		return new MyInner();
	}

	float getValue() {
		return getInner().f();
	}
}

public class Q_31_MyOuter {
	public static void main(String[] args) {
		MyOuter outer = new MyOuter();
		System.out.println(outer.getValue());
		
		//Compiler Error:
		//MyOuter.MyInner outerInner = new MyOuter().new MyInner(); //private!!!
		//System.out.println(outerInner.f());						//private!!!
		
	}
}
