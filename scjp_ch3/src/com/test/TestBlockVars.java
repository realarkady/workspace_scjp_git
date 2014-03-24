package com.test;

public class TestBlockVars {
	
	public TestBlockVars() {	}
	
	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 10;
		
		byte b2 = (byte) (s1 + b1);
		b2 += b2;
		System.out.println("b2: "+b2);
		
		int s3 = 1 + 1;
		
		int i1 = 10;
		long l1 = 10000000000l;
		
		int i2 = (int) (i1 + l1);
		System.out.println("i2: "+i2);
		
		int i3 = 5/3;
		System.out.println("i3: "+i3);
	}
	
}

class BlockVars {
	int i = 15;
	
	public BlockVars() {
		i = 2;
	}
	
	{
		int i = 10;
	}
	
	
}

