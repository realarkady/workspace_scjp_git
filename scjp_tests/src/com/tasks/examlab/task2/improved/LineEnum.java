package com.tasks.examlab.task2.improved;

public class LineEnum {

	public LineEnum() {	}
	
	enum Lines {
		full			("+===+ "), 
		leftRight		("|   | "), 
		leftOnly		("|     "), 
		rightOnly		("    | "), 
		plusLeftRight 	("+   + "), 
		plusLeft		("+     "), 
		plusMiddle		("  +   "), 
		plusRight		("    + "), 
		empty			("      ");
		
		private String line;
		
		Lines(String line){
			this.line = line;
		}
		
		public String getLine(){
			return line;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(Lines.full.getLine());
		
	}
}
