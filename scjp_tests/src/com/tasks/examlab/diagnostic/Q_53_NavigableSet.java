package com.tasks.examlab.diagnostic;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Q_53_NavigableSet {

	public static void main(String args[]) throws Throwable {
		TreeSet<String> mts = new TreeSet<String>();
		mts.add("one");
		mts.add("two");
		mts.add("three");
		mts.add("four");
		mts.add("five");
		
		// compilation ERROR!!! -->> tailSet(Object) returns a "SortedSet" && tailSet(Object, boolean) returns a "NavigableSet" 
		// NavigableSet<String> tas = mts.tailSet("three");
		// this compiles fine:
		NavigableSet<String> tas = mts.tailSet("three", false);
		// and this also:
		SortedSet<String> tas_1 = mts.tailSet("three");
		
		for (String st : tas) {
			System.out.print(st + " ");
		}
	}

}