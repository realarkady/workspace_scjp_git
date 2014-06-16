package com.test.whizlabs.exam2;

public class Q_05_StringBuffer_no_override_equals {
	public static void main(String[] args) {
		 StringBuffer s1=new StringBuffer("hello");
		 StringBuffer s2=new StringBuffer("hello");
		 Float f1=9.0F;
		 Double f2=9.0; 
		 System.out.print(f1.equals(f2)); 
		 System.out.print(s1==s2);
		 System.out.print(s1.equals(s2));
	}
}