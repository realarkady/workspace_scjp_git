package com.test.whizlabs.exam2;

public class Q_36_InnerClass_access {
	// if not "static" -> compilation fails at line #3
	static int i = 10; // 1

	Q_36_InnerClass_access() {
		System.out.print("Outer"); // 2
	}

	static class MyInner {
		MyInner() {
			System.out.print(i); // 3
		}
	}

	public static void main(String[] args) { // 4
		new Q_36_InnerClass_access.MyInner(); // 5
	}
}