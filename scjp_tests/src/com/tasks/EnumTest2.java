package com.tasks;

import java.util.LinkedList;

class A {
}

class B extends A {
}

class C extends A {
}

public class EnumTest2 {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList ();
		
		float i = 0;
		final byte j = 5;
		final short s = 4;
		while (i < 6) {
			switch ((int) i + 2) { // 1
			default: // 2
			case j:
				System.out.println("one"); // 3
				break;
			case s: // 4
			{
				System.out.println("two");
				break;
			}
			}
			i++;
		}
	}
}