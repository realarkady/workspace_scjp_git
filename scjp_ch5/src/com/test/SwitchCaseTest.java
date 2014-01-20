package com.test;

public class SwitchCaseTest{
	
	public SwitchCaseTest() {	}

	public static void main(String[] args) {
		Long l = 5l;
		float f = 5.0F;
		
		Boolean a = true;
		Boolean b= false;
		//System.out.println(b=a);
		
		int i = 999999999;
		
		switch (i) {
		case 1:{
			System.out.println(i++);
			break;}
		case 2+5:
			System.out.println(i++);
			break;
		default:
			System.out.println("default");
			//break;
		case 3:
			System.out.println(i);
			//break;
		case 4:
			System.out.println(i);
			//break;
		}
		
	}
	
}
