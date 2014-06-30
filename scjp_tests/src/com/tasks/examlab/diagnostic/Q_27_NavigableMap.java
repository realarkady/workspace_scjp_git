package com.tasks.examlab.diagnostic;

import java.util.*;

public class Q_27_NavigableMap {
	
	public static void main(String... args) {
		NavigableMap<String, Integer> navmp = new TreeMap<String, Integer>();
		navmp.put("one", 1);
		navmp.put("two", 2);
		navmp.put("three", 3);
		navmp.put("four", 4);
		navmp.put("five", 5);
		navmp.put("six", 6);
		
		String[] ob = new String[] { 
			//navmp.lowerKey("five"), //throws a NullPointerException when calling ob[0] later
			navmp.higherKey("five"), 
			navmp.ceilingKey("five"),
			navmp.floorKey("five"), 
		};
		
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i].toString() + ",");
		}
		
	}

}