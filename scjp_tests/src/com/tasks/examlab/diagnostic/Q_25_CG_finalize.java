package com.tasks.examlab.diagnostic;

public class Q_25_CG_finalize {

	static int i = 0;
	Q_25_CG_finalize g = null;

	public void finalize() {
		i++;
	}

	public static void main(String arhs[]) {
		Q_25_CG_finalize gab1 = new Q_25_CG_finalize();
		Q_25_CG_finalize gab2 = new Q_25_CG_finalize();
		Q_25_CG_finalize gab3 = new Q_25_CG_finalize();
		gab3.g = gab1;
		gab1.g = gab2;
		gab3.g = gab2;
		gab1 = null;
		gab3 = null;
		Runtime.getRuntime().gc();
		System.out.print(i + " objects removed");
	}

}