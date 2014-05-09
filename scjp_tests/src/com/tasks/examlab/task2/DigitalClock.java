package com.tasks.examlab.task2;

import java.text.DateFormat;
import java.util.Date;

public class DigitalClock {
	public DigitalClock() {	}
	
	public String getTime(){
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		df.format(date.getDate());
		
		return date.getHours() + ":" +date.getMinutes() + ":" +date.getSeconds();
	}
}
