package com.tasks.examlab.task2.improved;

public class Clock {
	
	public Clock() {	}
	
	public static void main(String[] args) {
		Clock clock = new Clock();
		//System.out.println(clock.getClockDigit(':'));
		System.out.println(clock.getClockTime());
		
	}
	
	public synchronized String getClockTime() {
		return buildClockTime(Time.getTime());
	}
	
	protected String buildClockTime(String s) {
		StringBuilder sb = new StringBuilder();
		Digit[] digits = getClockDigits(s);
		
		sb.append("\n");
		for (Digit digit : digits) sb.append(digit.getLevelOne());
		sb.append("\n");
		for (Digit digit : digits) sb.append(digit.getLevelTwo());
		sb.append("\n");
		for (Digit digit : digits) sb.append(digit.getLevelThree());
		sb.append("\n");
		for (Digit digit : digits) sb.append(digit.getLevelFour());
		sb.append("\n");
		for (Digit digit : digits) sb.append(digit.getLevelFive());
		sb.append("\n");
		for (Digit digit : digits) sb.append(digit.getLevelSix());
		sb.append("\n");
		for (Digit digit : digits) sb.append(digit.getLevelSeven());
		
		return sb.toString();
	}
	
	protected Digit[] getClockDigits(String s) {
		Digit[] digits = new Digit[s.length()];
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			digits[i] = getClockDigit(c);
		}
		return digits;
	}
	
	protected Digit getClockDigit(char c) {
		switch(c){
		case '0' : return new Digit(
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.full.getLine());
		case '1' : return new Digit(
				LineEnum.Lines.plusRight.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.plusRight.getLine());
		case '2' : return new Digit(
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.leftOnly.getLine(), 
				LineEnum.Lines.leftOnly.getLine(), 
				LineEnum.Lines.full.getLine());
		case '3' : return new Digit(
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.full.getLine());
		case '4' : return new Digit(
				LineEnum.Lines.plusLeftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.plusRight.getLine());
		case '5' : return new Digit(
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.leftOnly.getLine(), 
				LineEnum.Lines.leftOnly.getLine(), 
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.full.getLine());
		case '6' : return new Digit(
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.leftOnly.getLine(), 
				LineEnum.Lines.leftOnly.getLine(), 
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.full.getLine());
		case '7' : return new Digit(
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.plusRight.getLine());
		case '8' : return new Digit(
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.full.getLine());
		case '9' : return new Digit(
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.leftRight.getLine(), 
				LineEnum.Lines.full.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.rightOnly.getLine(), 
				LineEnum.Lines.full.getLine());
		case ':' : return new Digit(
				LineEnum.Lines.empty.getLine(), 
				LineEnum.Lines.empty.getLine(), 
				LineEnum.Lines.plusMiddle.getLine(), 
				LineEnum.Lines.empty.getLine(), 
				LineEnum.Lines.plusMiddle.getLine(), 
				LineEnum.Lines.empty.getLine(), 
				LineEnum.Lines.empty.getLine());

		}
		
		return null;
	}
	
	
}
