package com.tasks.examlab.diagnostic;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class Q_40_passing_Locale {
	public static void main(String args[]) {
		// Date d = new Date(new Locale("")); // compiler ERROR! -->> 
		Calendar c = Calendar.getInstance(new Locale(""));
		// Locale l = new Locale(new Locale("")); // compiler ERROR! -->> 
		// DateFormat df = DateFormat.getDateInstance(new Locale("")); // compiler ERROR! -->> 
		NumberFormat nf = NumberFormat.getInstance(new Locale(""));
		
	}
}