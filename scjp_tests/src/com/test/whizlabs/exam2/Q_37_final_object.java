package com.test.whizlabs.exam2;

public class Q_37_final_object {
	final Object obj;

	Q_37_final_object() {
		obj = null; // 1
		System.out.println(obj instanceof Object); // 2
		Integer i = new Integer("1"); // 3
		//obj = i; // 4 Compilation fails!!!
	}

	public static void main(String args[]) {
		Q_37_final_object test = new Q_37_final_object();
		System.out.println(test.obj);
	}
}