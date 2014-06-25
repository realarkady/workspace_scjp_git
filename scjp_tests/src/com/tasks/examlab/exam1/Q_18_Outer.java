package com.tasks.examlab.exam1;

public class Q_18_Outer extends Thread {
	
	public void run() {
		System.out.print("1");
	}
	
	public class Inner extends Q_18_Outer {
		public void run() {
			System.out.print("2");
		}
	}
	
	public static void main(String args[]) {
		Q_18_Outer ob1 = new Q_18_Outer();
		Q_18_Outer ob2 = ob1.new Inner();
		Q_18_Outer.Inner ob3 = ob1.new Inner();
		
		ob1.start();
		ob2.start();
		ob3.start();
		
	}

}
