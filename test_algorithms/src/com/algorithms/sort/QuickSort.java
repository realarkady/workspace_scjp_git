package com.algorithms.sort;

public class QuickSort {

	public static void main(String[] args) {
		Integer[] a = { 5, 1, 44, 15, 88, 65, 31, 4, 75, 11, 6 };
		int[] arr = { 5, 1, 44, 15, 88, 65, 31, 4, 75, 11, 6 };
		SortUtility.show(a);
		sort(a);
		SortUtility.show(a);
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void sort(Comparable[] a) {
		int i = a.length / 2;
		System.out.println(i);
	}

	public static void bubbleSort(int[] arr) {
		int size = arr.length;
		int temp;
		for (int j = size - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
