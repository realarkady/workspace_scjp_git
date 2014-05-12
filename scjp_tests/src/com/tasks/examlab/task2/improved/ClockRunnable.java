package com.tasks.examlab.task2.improved;

public class ClockRunnable implements Runnable{
	private Clock clock = new Clock();
	
	public ClockRunnable(Clock clock) {
		super();
		this.clock = clock;
	}
	
	@Override
	public void run() {
		while(true){
			try{
				System.out.println(clock.getClockTime());
				Thread.sleep(1000);
			} catch (InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}

}
