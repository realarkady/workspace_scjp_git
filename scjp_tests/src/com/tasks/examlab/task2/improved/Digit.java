package com.tasks.examlab.task2.improved;

public class Digit {
	private String levelOne;
	private String levelTwo;
	private String levelThree;
	private String levelFour;
	private String levelFive;
	private String levelSix;
	private String levelSeven;
	
	public Digit() {	}
	
	public Digit(String levelOne, String levelTwo, String levelThree,
			String levelFour, String levelFive, String levelSix,
			String levelSeven) {
		super();
		this.levelOne = levelOne;
		this.levelTwo = levelTwo;
		this.levelThree = levelThree;
		this.levelFour = levelFour;
		this.levelFive = levelFive;
		this.levelSix = levelSix;
		this.levelSeven = levelSeven;
	}
	
	public String getLevelOne() {
		return levelOne;
	}
	
	public String getLevelTwo() {
		return levelTwo;
	}
	
	public String getLevelThree() {
		return levelThree;
	}
	
	public String getLevelFour() {
		return levelFour;
	}
	
	public String getLevelFive() {
		return levelFive;
	}
	
	public String getLevelSix() {
		return levelSix;
	}
	
	public String getLevelSeven() {
		return levelSeven;
	}

	@Override
	public String toString() {
		return levelOne + "\n" + levelTwo + "\n" + levelThree + "\n" + 
				levelFour + "\n" + levelFive + "\n" + levelSix + "\n" + levelSeven;
	}
	
}
