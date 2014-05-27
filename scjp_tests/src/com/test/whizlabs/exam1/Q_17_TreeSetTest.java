package com.test.whizlabs.exam1;

import java.util.Collection;
import java.util.TreeSet;

public class Q_17_TreeSetTest {
	public static void main(String[] args) {
		Collection<String> set = new TreeSet<String>();
		set.add("Java");
		set.add("XML");
		set.add("Swing");
		set.add("JSP");
		set.add("Java");
		for (Object o : set) {
			System.out.print(o + " ");
		}
	}
}
