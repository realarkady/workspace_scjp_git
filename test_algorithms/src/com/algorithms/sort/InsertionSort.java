package com.algorithms.sort;

public class InsertionSort {

	public InsertionSort() {	}

	public static void main(String[] args) {
		Integer[] a = {2,4,45,1,8,3,44,25,9};
		SortUtility.show(a);
		sort(a);
		SortUtility.show(a);
	}
	
	public static void sort(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j>0 && SortUtility.less(a[j], a[j-1]); j--) {
				SortUtility.exchange(a, j, j-1);
			}
		}
	}
}
