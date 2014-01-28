package com.test.problems;

public class TestBubbleSort {

	public TestBubbleSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		int[] arr = new int[]{5,4,3,1,2};
		int[] sArr = sortArr(arr);
		for(int i : arr)
			System.out.print(i + " ");
	}

	public static int[] sortArr(int[] arr){
		boolean isNotSorted = true;
		while(isNotSorted){
			int count = 0;
			for(int i=1;i<arr.length;i++){
				if(arr[i]<arr[i-1]){
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
					count++;
				}
			}
			if(count==0)
				isNotSorted = false;
		}
		return arr;
	}

}
