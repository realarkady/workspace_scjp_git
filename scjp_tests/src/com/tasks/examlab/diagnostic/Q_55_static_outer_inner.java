package com.tasks.examlab.diagnostic;

import java.util.Collections;

public class Q_55_static_outer_inner {

	static int i = 0;

	public static int getRef() {
		return i++;
	}

	public static class Tash {
		static int p = 0;

		public static int getRef() {
			return i + p++;
		}
	}
	
	public static void main(String... argv) {
		int a1 = new Q_55_static_outer_inner().getRef();
		int a2 = new Q_55_static_outer_inner().getRef();
		int a3 = new Q_55_static_outer_inner.Tash().getRef();
		int a4 = new Q_55_static_outer_inner.Tash().getRef();
		Q_55_static_outer_inner.Tash t = new Q_55_static_outer_inner.Tash();
		System.out.print(a1 + ":" + a2 + ":" + a3 + ":" + a4);
		
		boolean b = new Boolean("TRue");
		
		System.out.println(new Integer("0100"));
	}
	
}