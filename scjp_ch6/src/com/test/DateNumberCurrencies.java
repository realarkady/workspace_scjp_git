package com.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateNumberCurrencies {

	public DateNumberCurrencies() {	}

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Locale loc = new Locale("fr");
		Date date = c.getTime();
		DateFormat df = DateFormat.getDateInstance(2, loc);
		
		System.out.println("Date: "+df.format(date));
	}

}
