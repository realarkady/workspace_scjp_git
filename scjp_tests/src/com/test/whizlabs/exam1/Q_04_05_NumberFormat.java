package com.test.whizlabs.exam1;

import java.text.NumberFormat;
import java.util.Locale;

public class Q_04_05_NumberFormat {

	public static void main(String[] args) {
		NumberFormat i1 = NumberFormat.getInstance(Locale.ITALY);
		// NumberFormat i2 = new NumberFormat();
		// NumberFormat i3 = new NumberFormat(Locale.ITALY);
		NumberFormat i4 = NumberFormat.getInstance();
		
		// Locale();
		Locale l1 = new Locale("language");
		Locale l2 = new Locale("language", "country");
		Locale l3 = new Locale("language", "country", "variant");

	}

}
