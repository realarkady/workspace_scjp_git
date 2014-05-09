package com.tasks.examlab.task2;

import java.util.Date;

public class DigitalClock {
	public DigitalClock() {	}
	
	public String getTime(){
		Date date = new Date();
		return date.getHours() + ":" +date.getMinutes() + ":" +date.getSeconds();
	}
}
