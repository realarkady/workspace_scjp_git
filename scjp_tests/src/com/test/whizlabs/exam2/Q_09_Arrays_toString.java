package com.test.whizlabs.exam2;

import java.util.Arrays;

public class Q_09_Arrays_toString {
	public static void main(String[] args) {
		String str = "She sells sea shells";
		System.out.println(Arrays.toString(str.split("\\s")));
	}
}