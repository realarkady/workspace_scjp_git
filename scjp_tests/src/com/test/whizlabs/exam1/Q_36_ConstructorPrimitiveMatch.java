package com.test.whizlabs.exam1;

class C {
	int i;

	C() {
	}
}

class D extends C {
	D(short i) {
		this.i = i;
		System.out.print("short");
	}

	D(float j) {
		i = (int) j;
		System.out.print("float");
	}
}

public class Q_36_ConstructorPrimitiveMatch extends D {
	Q_36_ConstructorPrimitiveMatch() {
		super(4);
	}

	public static void main(String[] args) {
		System.out.print(new Q_36_ConstructorPrimitiveMatch().i); // line 1
	}
}