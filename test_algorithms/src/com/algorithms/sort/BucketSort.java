package com.algorithms.sort;

public class BucketSort {
	
	public static void main(String[] args) {
		Integer[] a = { 5, 1, 44, 15, 88, 65, 31, 4, 75, 11, 6 };
		int[] arr = { 5, 1, 44, 15, 88, 65, 31, 4, 75, 11, 6, 65 };
		SortUtility.show(arr);
		
		int[] sorted = bucketSort(arr);
		SortUtility.show(sorted);
		
	}
	
	public static int[] bucketSort(int[] a) {
		if(a == null || a.length == 0)
			return null;
		
		int min = 0;
		int max = 0;
		int[] temp;
		int[] sorted = new int[a.length];
		
		//find max
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}
		
		//create buckets array
		temp = new int[max-min+1];
		
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			temp[j]++;
		}
		
		SortUtility.show(temp);
		
		//reconstruct the array sorted in ascending order
		int z = 0;
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i]; j++) {
				sorted[z] = i;
				z++;
			}
		}
		
		return sorted;
	}
	
	public static void exchange(int[] a, int m, int n) {
		int temp = a[n];
		a[n] = a[m];
		a[m] = temp;
	}
}
