package com.test.whizlabs.exam2;

public class Q_38_tricky_switch_case {
	public static void main(String[] args) {
		float i = 0;
		final byte j = 5;
		final short s = 4;
		while (i < 5) {
			switch ((int) i + 2) { // 1
			default: // 2
			case j:
				System.out.println("one"); // 3
				break;
			case s: // 4 Compilation Fails if "case s + 1:" !!!
			{
				System.out.println("two");
				break;
			}
			}
			i++;
		}
	}
}