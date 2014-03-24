package com.test;

public class TestBoxingWideningVarargs {

	public TestBoxingWideningVarargs() {	}

	public static void main(String[] args) {
		Integer[] intArr = {1,2,3,4,5};
		int int1 = 1;
		int int2 = 2;
		int int3 = 3;
		
		calculate(int1, int2, int3);
		
		Integer i1 = 127;
		Integer i2 = 127;
		System.out.println(i1==i2);
		
		int i11 = 128;
		int i22 = 128;
		System.out.println(i11==i22);
		
		Object iObj1 = 128;
		Integer i3 = 128;
		System.out.println(iObj1.equals(i3));
	}
	
	public static void calculate(Integer... args) {
		int i = 0;
		for (Integer integer : args) {
			i += integer;
		}
		System.out.println("i: " + i);
	}
	
	
}
