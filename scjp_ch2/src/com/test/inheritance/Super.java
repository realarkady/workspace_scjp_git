package com.test.inheritance;

public class Super {
	public int a;
	
	protected Super(int a) {
		this.a = a;
	}
}

class Sub extends Super {
	public Sub(int a) {
		super(a);
	}
	
	//public Sub() {
	//	this.a = 5;
	//}
}
