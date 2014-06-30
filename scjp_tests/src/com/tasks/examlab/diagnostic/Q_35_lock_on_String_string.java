package com.tasks.examlab.diagnostic;

public class Q_35_lock_on_String_string extends Thread {
	public void run() {
		synchronized (new String("a")) {
			System.out.print("-A-");
			System.out.print("-B-");
			System.out.print("-C-");
		}
	}

	public static void main(String args[]) {
		Q_35_lock_on_String_string tw = new Q_35_lock_on_String_string();
		Thread rb1 = new Thread(tw);
		Thread rb2 = new Thread(tw);
		rb1.start();
		rb2.start();
	}
}