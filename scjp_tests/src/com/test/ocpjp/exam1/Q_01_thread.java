package com.test.ocpjp.exam1;

public class Q_01_thread extends Thread {
	static Thread t1, t2, t3;
	
	public Q_01_thread() {	}
	public static void main(String[] args){
		t1 = new Thread(new Q_01_thread());
		t2 = new Thread(new Q_01_thread());
		t3 = new Thread(new Q_01_thread());
		t1.start();
		t2.start();
		t3.start();
		
	}
	public void run(){
		for (int i = 0; i < 500; i++) {
			System.out.println(Thread.currentThread().getId() + " ");
			if(i==250)
				try{
					System.out.println("**" + t1.getId() + "**");
					t1.sleep(600);
				} catch(Exception e) {
					
				}
		}
	}
}
