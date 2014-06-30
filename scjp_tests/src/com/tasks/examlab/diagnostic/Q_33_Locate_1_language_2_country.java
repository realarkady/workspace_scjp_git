package com.tasks.examlab.diagnostic;

import java.util.*;

public class Q_33_Locate_1_language_2_country {
	public static void main(String... args) {
		//prints nothing:
		Locale lc1 = new Locale("gb");
		System.out.println(lc1.getDisplayCountry());
		
		//prints "United Kingdom"
		Locale lc2 = new Locale("en", "gb");
		System.out.println(lc2.getDisplayCountry());
		//System.out.println(lc2.getCountry());
		
	}
	
}