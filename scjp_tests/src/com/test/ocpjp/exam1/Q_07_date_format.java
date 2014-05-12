package com.test.ocpjp.exam1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Q_07_date_format {
	static Thread t1, t2, t3;
	
	public Q_07_date_format() {	}
	
	public static void main(String[] args){
		Date d = new Date();
		DateFormat df;
		Locale[] la = {new Locale("it", "IT"), new Locale("pt")};
		for (Locale loc : la) {
			df = DateFormat.getDateInstance(DateFormat.FULL, loc);
			//System.out.println(d.format(df)); // Compiler error 
			System.out.println(df.format(d));  
		}
		
	}
	
}
