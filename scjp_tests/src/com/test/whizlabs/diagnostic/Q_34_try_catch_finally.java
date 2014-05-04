package com.test.whizlabs.diagnostic;

import java.io.IOException;

public class Q_34_try_catch_finally {

	public Q_34_try_catch_finally() {	}
	
	public void tryThis() throws IOException {
		throw new IOException();
	}
	
	public static void main(String[] args) {
		Q_34_try_catch_finally t = new Q_34_try_catch_finally();
		try {
			t.tryThis();
			return;
		} catch (IOException x1) {
			System.out.println("exception 1");
			return;
		} catch (Exception x2) {
			System.out.println("exception 2");
			//return;
		}
		finally {
			System.out.println("finally");
			//return;
		}
		System.out.println("main finished normally...");
	}
	
}
