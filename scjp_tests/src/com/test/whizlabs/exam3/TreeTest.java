package com.test.whizlabs.exam3;

import java.util.*;

class MyClass implements java.io.Serializable {
	int i;

	MyClass(int i) {
		this.i = i;
	}

	public String toString() {
		return ("" + i);
	}
}

public class TreeTest {
	public static void main(String[] args) {
		Set<MyClass> s = new TreeSet<MyClass>();
		Thread t = new Thread();
		t.start();
		System.out.print("X");
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("Y");
	}
}
