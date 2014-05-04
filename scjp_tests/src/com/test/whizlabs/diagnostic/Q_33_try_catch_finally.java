package com.test.whizlabs.diagnostic;

public class Q_33_try_catch_finally {

	public Q_33_try_catch_finally() {	}
	
	void f() {
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		Q_33_try_catch_finally t = new Q_33_try_catch_finally();
		try {
			t.f();
		} catch (Throwable e) {
			try {
				throw (Exception) e; 
			} catch (Exception ex) {
				System.out.println("catch1");
				return;
			} finally {
				System.out.println("finally1");
				return;
			}
		} finally {
			System.out.println("finally2");
		}
		System.out.println("main finished normally...");
	}
	
}
