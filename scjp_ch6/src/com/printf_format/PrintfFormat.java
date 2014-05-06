package com.printf_format;

public class PrintfFormat {

	public PrintfFormat() {	}

	public static void main(String[] args) {
		int i1 = -123;
		int i2 = 12345;
		float i3 = 12345.6781F;
		System.out.printf(">%1$(7d< \n", i1);
		System.out.printf(">%0,17d< \n", i2);
		System.out.format(">%+-7d< \n", i2);
		System.out.printf(">%2$b + %1$5d< \n", i1, false);
		System.out.printf(">%-+,20.4f< \n", i3);
		boolean b = true;
		System.out.println("result: " + (b = false));
		System.out.println("0%4 = " + 1999%4);
		
	}

}
