package com.tasks.examlab.task2.improved;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	//private String time;
	
	public Time() {	}
	
	public static void main(String[] args) {
		System.out.println(getTime());
	}
	
	public static String getTime() {
		DateFormat df = new SimpleDateFormat("HH:mm:ss"); 
		return df.format(new Date());
	}
}
