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
			System.out.println("matcher.group() // The e-mail id is: " + matcher.group());
			System.out.println("matcher.start(): " + matcher.start());
			System.out.println("matcher.end(): " + matcher.end());
		}
	}

}
