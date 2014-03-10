package com.algorithms.sort;

public class SortUtility {

	public static void main(String[] args) {
		
	}
	
	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
	
	public static void exchange(Comparable[] a, int i, int j) {
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void show(Comparable[] a) {
		for(Comparable i : a)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public static void show(int[] a) {
		for(int i : a)
			System.out.print(i + " ");
		System.out.println();
	}
	
	// is sorted (checks for ascending only)
	public static boolean isSorted(Comparable[] a) {
		for(int i = 1; i < a.length; i++)
			if(less(a[i], a[i-1]))
				return false;
		return true;
	}
	
}
