package com.test.whizlabs.exam2;

import java.util.ArrayList;

public class Q_11_List_toArray {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("1");
		a.add("2");
		a.add("1");
		String[] s = (String[]) a.toArray(new String[0]);
		for (String str : s)
			System.out.print(str);
	}
}