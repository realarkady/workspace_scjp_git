package com.algorithms.sort;

public class SelectionSort {

	public SelectionSort() {	}

	public static void main(String[] args) {
		Integer[] a = {2,4,45,1,8,3,44,25,9};
		SortUtility.show(a);
		sort(a);
		SortUtility.show(a);
	}
	
	public static void sort(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(SortUtility.less(a[j], a[min]))
					min = j;
			}
			SortUtility.exchange(a, i, min);
		}
	}
}
