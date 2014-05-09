package com.tasks.examlab.task2;

public class DigitalClockRunnable implements Runnable{
	private DigitalClock digitalClock = new DigitalClock();
	
	public DigitalClockRunnable() {
		
	}

	public static void main(String[] args) {
		DigitalClockRunnable dcr = new DigitalClockRunnable();
		Thread digitalClockThread = new Thread(dcr);
		digitalClockThread.start();
		
	}

	@Override
	public void run() {
		while(true){
			try {
				System.out.println(digitalClock.getTime());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
