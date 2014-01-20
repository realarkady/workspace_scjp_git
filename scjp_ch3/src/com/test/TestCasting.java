package com.test;

public class TestCasting {
	public static void main(String[] args) {
		Integer i1 = 500;
		Integer i2 = 500;
		//System.out.println(i1 == i2);
		
		Character c1 = new Character('c');
		Character c2 = new Character('c');
		System.out.println(c1 == c2);
		
		String s1 = Character.toString(c1);
		System.out.println(s1);
		
		
		int[][] a = {{1,2,3}, {4,5,6}};
		int[] b = (int[])a[1];
		Object o = a;
		int[][] c = (int[][]) o;
		int[] d = (int[]) o;
		
	}
}

