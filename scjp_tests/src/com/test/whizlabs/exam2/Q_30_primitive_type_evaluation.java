package com.test.whizlabs.exam2;

public class Q_30_primitive_type_evaluation {
	public static void main(String[] args) {
		byte b = 127;
		short s = 4;
		int i = 5;
		long l = 6;
		//printSum(b, b);
		//printSum(s, s);
		//printSum(i, i);
		//printSum(l, l);
		
		printSum(new Integer(1), new Integer(2));
		printSum(2, 3);
		
	}
/*
	public synchronized static void printSum(byte x, byte y) {
		System.out.println("byte: " + (x + y));
	}	
	
	public synchronized static void printSum(short x, short y) {
		System.out.println("short: " + (x + y));
	}	
	
	public synchronized static void printSum(int x, int y) {
		System.out.println("int: " + (x + y));
	}	
	
	public synchronized static void printSum(long x, long y) {
		System.out.println("long: " + (x + y));
	}
*/
	public synchronized static void printSum(Byte x, Byte y) {
		System.out.println("Byte: " + (x + y));
	}
	
	public synchronized static void printSum(Short x, Short y) {
		System.out.println("Short: " + (x + y));
	}
	
	public synchronized static void printSum(Integer x, Integer y) {
		System.out.println("Integer: " + (x + y));
	}

	public synchronized static void printSum(Long x, Long y) {
		System.out.println("Long: " + (x + y));
	}
}