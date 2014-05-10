package com.tasks.examlab.task2;

public class LevelEnum {

	public LevelEnum() {	}
	
	enum Levels {
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
		
		Levels(String line){
			this.line = line;
		}
		
		public String getLine(){
			return line;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(Levels.full.getLine());
		
	}
}
