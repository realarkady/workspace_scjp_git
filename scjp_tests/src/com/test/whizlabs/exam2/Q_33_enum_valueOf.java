package com.test.whizlabs.exam2;

enum Fish {
	GOLDFISH, ANGELFISH, GUPPY;
}

public class Q_33_enum_valueOf {
	public static void main(String[] args) {
		Fish f = Fish.valueOf("GUPPY");
		if (f == Fish.GUPPY)
			System.out.println("Are equal");
		if (f.equals(Fish.GUPPY))
			System.out.println("Are equal");
	}
}