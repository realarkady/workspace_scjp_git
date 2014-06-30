package com.tasks.examlab.diagnostic;

import java.util.*;

public class Q_22_generics_wildcard {
	public static void main(String args[]) {
		List<? extends Number> ml = new Vector<Integer>();
		// Insert Here
		// only NULL value accepted!!! no Integer/Double/Object/ect
		ml.add(null);
		System.out.println(ml.get(0));
	}
}