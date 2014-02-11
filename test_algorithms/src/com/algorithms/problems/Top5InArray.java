package com.algorithms.problems;

import javax.rmi.CORBA.Util;

import com.algorithms.datastructures.generic.Utility;

public class Top5InArray {
	public static final int FIVE = 5;
	public Top5InArray() {	}

	public static void main(String[] args) {
		int[] a = Utility.populateRandomArray(15, 100);
		Utility.printArray(a);
		
		System.out.println();
		
		int[] top5 = getTop5(a);
		Utility.printArray(top5);
		
	}
	
	public static int[] getTop5(int[] a) {
		int[] temp = new int[FIVE];
		int i = 0;
		
		//apply insertion sort to bring the five max numbers at start of the array
		while(i < FIVE){
			int max = 0;
			int jMax = 0;
			for (int j = i; j < a.length; j++) {
				if(a[j] > max){ //find max
					max = a[j];
					jMax = j;
				}
			}
			Utility.swap(a, i, jMax); //bring up front
			i++;
		}
		
		//populate the output array
		for (int j = 0; j < FIVE; ++j) {
			temp[j] = a[j];
		}
		
		return temp;
	}
	
}
