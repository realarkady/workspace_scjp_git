package com.test.whizlabs.diagnostic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q_01_Pattern_Matcher {

	public Q_01_Pattern_Matcher() {
	}
	

	public static void main(String[] args) {
		String regex = "(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";

		String s = "The e-mail ids are tom@abc.com and harry@xyz.com";

		// Insert here
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		while (matcher.find()) {
			//System.out.println("matcher.group() // The e-mail id is: " + matcher.group());
			//System.out.println("matcher.start(): " + matcher.start());
			//System.out.println("matcher.end(): " + matcher.end());
		}
		
		String regex1 = "(ab)[a-z]";//"(\\w+)@(\\w+\\.)(\\w+)(\\.\\w+)*";

		String s1 = "The e-mail ids are tom@abc.com and harry@xyz.com";

		// Insert here
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(s1);
		while (matcher1.find()) {
			System.out.println("matcher1.group() // The e-mail id is: " + matcher1.group());
			System.out.println("matcher1.start(): " + matcher1.start());
			System.out.println("matcher1.end(): " + matcher1.end());
		}
		
	}
	
}
