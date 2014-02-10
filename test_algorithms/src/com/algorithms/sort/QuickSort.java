package com.algorithms.sort;

public class QuickSort {

	public static void main(String[] args) {
		Integer[] a = { 5, 1, 44, 15, 88, 65, 31, 4, 75, 11, 6 };
		int[] arr = { 5, 1, 44, 15, 88, 65, 31, 4, 75, 11, 6 };
		SortUtility.show(a);
		//sort(a);
		SortUtility.show(a);
		quickSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void quickSort(int[] a) {
		int i = a.length / 2;
		System.out.println(i);
		quickSort(a, 0, a.length-1);
	}

	public static void quickSort(int[] a, int first, int last) {
		if(first >= last)
			return;
		
		int pivot = a[first];
		int i = first;
		int j = last - 1;
		
		while(i<j){
			while(i<pivot){
				i++;
			}
			
			while(j>pivot){
				j++;
			}
			
			
		}
		
	}
	
	public static void exchange(int[] a, int m, int n) {
		int temp = a[n];
		a[n] = a[m];
		a[m] = temp;
	}
}
