package com.test;

import java.util.ArrayList;
import java.util.List;

public class MyOuter2 {
	private String x = "Outer2";
	
	public static void main(String[] args){
		MyOuter2 mo = new MyOuter2();
		mo.doStuff();
		String s[] = {"1", "2"};
		//List<String> s = new ArrayList<String>(); s.add("hh");
		for (String i: s) {
			System.out.println(i);
		}
	}
	
	
	void doStuff() {
		final String x ="coco ";
		abstract class MyInnerA {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
			} // close inner class method
		} // close inner class definition
		class MyInner extends MyInnerA {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
			} // close inner class method
		} // close inner class definition
		MyInner mi = new MyInner(); // This line must come
		// after the class
		mi.seeOuter();
	} // close outer class method doStuff()
} // close outer class