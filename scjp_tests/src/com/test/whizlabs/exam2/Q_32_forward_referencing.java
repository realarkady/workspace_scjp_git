package com.test.whizlabs.exam2;

public class Q_32_forward_referencing {
	private int x = getValue();
	private int y = 5;

	private int getValue() {
		return y;
	}

	public static void main(String[] args) {
		Q_32_forward_referencing fr = new Q_32_forward_referencing();
		System.out.println(fr.x);
	}
}