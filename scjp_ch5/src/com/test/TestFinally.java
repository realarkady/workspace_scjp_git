package com.test;


public class TestFinally {
	
	public TestFinally() {	}

	public static void main(String[] args) throws Exception {
		System.out.println("--- start ---");
		
		try {
			System.out.println("try");
			throw new Exception("ark, custom msg");
		} catch (Exception e) {
			System.out.println("catch");
			throw (Exception) e;
		} finally {
			System.out.println("finally");
		}
		//System.out.println("--- end ---");
	}
	
}
