package com.test.whizlabs.exam1;

public class Q_53_AssertTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			try {
				assert i % 2 == 0 : i--;
				System.out.println("Even number : " + i);
			} catch (AssertionError ae) {
				System.out.println("Odd number : " + ++i);
			}
		}
	}
}