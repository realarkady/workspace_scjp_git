package com.tasks.examlab.exam1;

import java.util.*;

public class Q_02_ArraySort {
	public int a = 0;
	
	Q_02_ArraySort(int a) {
		this.a = a;
	}
	
	public String toString() {
		return "[" + a + "]";
	}
	
	public static void main(String args[]) {
		Q_02_ArraySort[] a = new Q_02_ArraySort[] { new Q_02_ArraySort(2),
				new Q_02_ArraySort(1), new Q_02_ArraySort(6) };
		Arrays.sort(a);
		for (Q_02_ArraySort s : a)
			System.out.print(s);
	}
}
