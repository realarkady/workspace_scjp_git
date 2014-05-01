package com.algorithms.problems;

import com.algorithms.datastructures.generic.BinaryTree;

public class p_04_03_tree_from_sorted_array_min_height {
	
	public p_04_03_tree_from_sorted_array_min_height() {	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		arrayToBT(arr);
	}
	
	public static BinaryTree arrayToBT(int[] arr) {
		if(isArraySorted(arr) == false)
			return null;
		int root = arr[arr.length/2];
		BinaryTree bTree = new BinaryTree(root);
		
		for (int i = 0; i < arr.length; i++) {
			bTree.insert(arr[i]);
			
		}
		bTree.find(arr[arr.length-1]);
		return bTree;
	}
	
	public static boolean isArraySorted(int[] arr) {
		if(arr.length == 0)
			return false;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i-1] > arr[i])
				return false;
			
		}
		return true;
	}
	
}
