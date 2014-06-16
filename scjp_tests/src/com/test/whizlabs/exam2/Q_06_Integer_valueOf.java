package com.test.whizlabs.exam2;

public class Q_06_Integer_valueOf {
	public static void main(String[] args) {
		Integer i1 = new Integer("1");
		Integer i2 = new Integer("2");
		Integer i3 = Integer.valueOf("3v");
		int i4 = i1 + i2 + i3;
		System.out.println(i4);
	}
}