package com.tasks.examlab.exam1;

public class Q_11_PrintWithReturns {
	int i = 1;
	
	public int getI() {
		System.out.print("Super");
		return i;
	}
	
	public static void main(String arhs[]) {
		Q_11_PrintWithReturns ga = new Arabik();
		System.out.print(ga.i + " " + ga.getI());
	}
}

class Arabik extends Q_11_PrintWithReturns {
	int i = 2;
	
	public int getI() {
		System.out.print("Sub");
		return i;
	}
}