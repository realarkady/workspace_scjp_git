package com.test;

import javax.security.auth.login.AccountException;

public class MyOuter {
	
	public MyOuter() {	}
	
	public static void main(String[] args) {
		Character c = new Character('2');
		
		MyOuter a = new MyOuter.MyInner();
		try {
			a.testInnerClassOverride();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testInnerClassOverride() throws Throwable {
		System.out.println("MyOuter"); 
		try {
			throw new AccountException();
		} catch (AccountException e) {
			// TODO Auto-generated catch block
			throw (Throwable) e;
		}
	}
	
	static class MyInner extends MyOuter{
		public static void main(String[] args) {
			MyOuter a = new MyOuter();
			try {
				a.testInnerClassOverride();
			} catch (AccountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void testInnerClassOverride(){
			System.out.println("MyInner"); 
		}
	}
}
