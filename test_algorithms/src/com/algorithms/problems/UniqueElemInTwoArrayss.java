package com.algorithms.problems;

import java.util.HashMap;
import java.util.Map;

import com.algorithms.datastructures.generic.Utility;

public class UniqueElemInTwoArrayss {
	static int[] arr1 = Utility.populateRandomArray(15, 10);
	static int[] arr2 = Utility.populateRandomArray(15, 10);
	
	public UniqueElemInTwoArrayss() {	}
	
	public static void main(String[] args) {
		Utility.printArray(arr1);
		System.out.println();
		Utility.printArray(arr2);
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		//int i = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			int value = 1;
			if(m.get(arr1[i]) != null)
				value = m.get(arr1[i]) + 1;
			m.put(arr1[i], value);
		}
		
		for (int i = 0; i < arr2.length; i++) {
			int value = 1;
			if(m.get(arr2[i]) != null)
				value = m.get(arr2[i]) + 1;
			m.put(arr2[i], value);
		}
		
		System.out.println("\nUnique set:\n");
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			if(entry.getValue() == 1)
				System.out.print(entry.getKey() + " ");
		}
		
	}
	
}
