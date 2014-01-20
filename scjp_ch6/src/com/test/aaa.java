package com.test;

public class aaa extends Thread{

	public aaa() {	
		start();
	}

	public static void main(String[] args) {
		String s = new String();
		aaa a = new aaa();
		a.tryMe();
		//a.start();
		System.out.println();
		
		
	}
	
	public void tryMe(){
		try {
			throw new Throwable();
		} catch (Throwable e1) {
			System.out.println("catch1");
			try {
				throw (Exception)e1;
			} catch (Exception e2) {
				System.out.println("catch2");
				return;
			} finally{
				System.out.println("finnaly2");
			}
		} finally{
			System.out.println("finnaly1");
		}
	}
}
