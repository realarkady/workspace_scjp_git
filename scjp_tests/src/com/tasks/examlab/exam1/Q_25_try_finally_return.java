package com.tasks.examlab.exam1;

public class Q_25_try_finally_return {
	private static String getNumber(int x) {
		try {
			return "" + (x - 2);
		} finally {
			return "" + (x + 2);
		}
	}

	public static void main(String args[]) {
		System.out.println(getNumber(5) + getNumber(5));
	}
}