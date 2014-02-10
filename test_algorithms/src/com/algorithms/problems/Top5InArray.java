package com.algorithms.problems;

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
		for (int i = 0; i < a.length; i++) {
			for(int j= 0; j<temp.length; j++){
				if(a[i] > temp[j]){
					temp[getPositionOfMin(temp)] = a[i];
					break;
				}
			}
		}
		
		return temp;
	}
	
	public static int getPositionOfMin(int[] arr){
		int min = 0;
		int minIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if(min < arr[i]){
				min = arr[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
