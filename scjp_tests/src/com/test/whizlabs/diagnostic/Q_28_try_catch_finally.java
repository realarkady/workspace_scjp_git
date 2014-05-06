package com.test.whizlabs.diagnostic;

public class Q_28_try_catch_finally {

	public Q_28_try_catch_finally() {	}
	
	void f() {
		throw new RuntimeException();
	}
	
	public static void main(String[] args) {
		Q_28_try_catch_finally t = new Q_28_try_catch_finally();
		try {
			t.f();
		} catch (Throwable e) {
			try {
				throw new Exception(); 
			} catch (Exception ex) {
				System.out.println("catch1");
				//throw ex; 	// compilation error, checked Exception()
			} finally {
				System.out.println("finally1");
			}
		} finally {
			System.out.println("finally2");
		}
		
	}
	
}
