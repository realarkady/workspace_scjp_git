package com.test.whizlabs.diagnostic;

enum Letters {
	A {
		public void getName() {
			System.out.println("I'm A ");
		}
	},
	B, C, D;

	public void getName() {
		System.out.println("I'm Letters etter ");
	}
};

public class ReturnInSwitch {

	public ReturnInSwitch() {
	}

	public static void main(String[] args) {
		Letters.A.getName();
		System.out.println(myMethod(Letters.A));
		System.out.println(myMethod(Letters.D));

	}

	public static Letters myMethod(Letters l) {
		switch (l) {
		case A:
			return Letters.A;
		default:
			return Letters.A;
		}

		// return null;
	}
}
