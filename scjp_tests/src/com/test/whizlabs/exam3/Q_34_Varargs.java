package com.test.whizlabs.exam3;

public class Q_34_Varargs {
	public static void main(String[] args) { // private!!!
		Integer i[] = { 1, 2, 3, 4 };
		// test(i); Compiler Error!!!
		test();
		test(new int[] { 1, 2, 3 });
	}

	public static void test(int... s) {
		for (int i : s)
			System.out.printf(" %d \n", i);
	}
}
