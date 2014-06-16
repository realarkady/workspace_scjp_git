package com.test.whizlabs.exam2;

public class Q_10_format_double {
	public static void main(String[] args) {
		double val1 = 3.91;
		double val2 = 3.97;
		double val3 = -2335.84;
		System.out.printf("%2$.1f %.1f %.1f %,(9.1f", val1, val2, val3);
	}
}