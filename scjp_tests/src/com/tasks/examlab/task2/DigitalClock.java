package com.tasks.examlab.task2;

import java.util.Date;

public class DigitalClock {
	private static String[][] digits;
	
	public DigitalClock() {	}
	
	public static void main(String[] args) {
		String[] s = getDigit('3');
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
	
	public static void printTime(){
		digits = getDigitalTime();
		/*for (int i = 0; i < digits.length; i++) {
			for (int j = 0; j < DigitBuilder.NUMBER_OF_LEVELS; j++) {
				String s = digits[i][j];
				System.out.println(s);
			}
		}*/
		for (int i = 0; i < DigitBuilder.NUMBER_OF_LEVELS; i++) {
			String s = "";
			for (int j = 0; j < digits.length; j++) {
				s += digits[j][i];
			}
			System.out.println(s);
		}
	}
	
	public static String getTime(){
		Date date = new Date();
		return date.getHours() + ":" +date.getMinutes() + ":" +date.getSeconds();
	}
	
	public static String[][] getDigitalTime(){
		String time = getTime();
		digits = new String[time.length()][DigitBuilder.NUMBER_OF_LEVELS];
		
		for (int i = 0; i < time.length(); i++) {
			digits[i] = getDigit(time.charAt(i)); 
		}
		
		return digits;
	}
	
	public static String[] getDigit(char c){
		switch(c){
			case '0' : return DigitBuilder.getZero();
			case '1' : return DigitBuilder.getOne();
			case '2' : return DigitBuilder.getTwo();
			case '3' : return DigitBuilder.getThree();
			case '4' : return DigitBuilder.getFour();
			case '5' : return DigitBuilder.getFive();
			case '6' : return DigitBuilder.getSix();
			case '7' : return DigitBuilder.getSeven();
			case '8' : return DigitBuilder.getZero();
			case '9' : return DigitBuilder.getNine();
			case ':' : return DigitBuilder.getColumn();
		}
		return null;
	}
}
