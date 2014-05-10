package com.tasks.examlab.task2;

public class DigitBuilder {
	public static final int NUMBER_OF_LEVELS = 7;
	private static String[] levels;
	
	public DigitBuilder() {	}
	
	public static String[] getZero(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.full.getLine();
		levels[1] = LevelEnum.Levels.leftRight.getLine();
		levels[2] = LevelEnum.Levels.leftRight.getLine();
		levels[3] = LevelEnum.Levels.leftRight.getLine();
		levels[4] = LevelEnum.Levels.leftRight.getLine();
		levels[5] = LevelEnum.Levels.leftRight.getLine();
		levels[6] = LevelEnum.Levels.full.getLine();
		return levels;
	}
	
	public static String[] getOne(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.plusRight.getLine();
		levels[1] = LevelEnum.Levels.rightOnly.getLine();
		levels[2] = LevelEnum.Levels.rightOnly.getLine();
		levels[3] = LevelEnum.Levels.rightOnly.getLine();
		levels[4] = LevelEnum.Levels.rightOnly.getLine();
		levels[5] = LevelEnum.Levels.rightOnly.getLine();
		levels[6] = LevelEnum.Levels.plusRight.getLine();
		return levels;
	}
	
	public static String[] getTwo(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.full.getLine();
		levels[1] = LevelEnum.Levels.rightOnly.getLine();
		levels[2] = LevelEnum.Levels.rightOnly.getLine();
		levels[3] = LevelEnum.Levels.full.getLine();
		levels[4] = LevelEnum.Levels.leftOnly.getLine();
		levels[5] = LevelEnum.Levels.leftOnly.getLine();
		levels[6] = LevelEnum.Levels.full.getLine();
		return levels;
	}
	
	public static String[] getThree(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.full.getLine();
		levels[1] = LevelEnum.Levels.rightOnly.getLine();
		levels[2] = LevelEnum.Levels.rightOnly.getLine();
		levels[3] = LevelEnum.Levels.full.getLine();
		levels[4] = LevelEnum.Levels.rightOnly.getLine();
		levels[5] = LevelEnum.Levels.rightOnly.getLine();
		levels[6] = LevelEnum.Levels.full.getLine();
		return levels;
	}
	
	public static String[] getFour(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.plusLeftRight.getLine();
		levels[1] = LevelEnum.Levels.leftRight.getLine();
		levels[2] = LevelEnum.Levels.leftRight.getLine();
		levels[3] = LevelEnum.Levels.full.getLine();
		levels[4] = LevelEnum.Levels.rightOnly.getLine();
		levels[5] = LevelEnum.Levels.rightOnly.getLine();
		levels[6] = LevelEnum.Levels.plusRight.getLine();
		return levels;
	}
	
	public static String[] getFive(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.full.getLine();
		levels[1] = LevelEnum.Levels.leftOnly.getLine();
		levels[2] = LevelEnum.Levels.leftOnly.getLine();
		levels[3] = LevelEnum.Levels.full.getLine();
		levels[4] = LevelEnum.Levels.rightOnly.getLine();
		levels[5] = LevelEnum.Levels.rightOnly.getLine();
		levels[6] = LevelEnum.Levels.full.getLine();
		return levels;
	}
	
	public static String[] getSix(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.full.getLine();
		levels[1] = LevelEnum.Levels.leftOnly.getLine();
		levels[2] = LevelEnum.Levels.leftOnly.getLine();
		levels[3] = LevelEnum.Levels.full.getLine();
		levels[4] = LevelEnum.Levels.leftRight.getLine();
		levels[5] = LevelEnum.Levels.leftRight.getLine();
		levels[6] = LevelEnum.Levels.full.getLine();
		return levels;
	}
	
	public static String[] getSeven(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.full.getLine();
		levels[1] = LevelEnum.Levels.rightOnly.getLine();
		levels[2] = LevelEnum.Levels.rightOnly.getLine();
		levels[3] = LevelEnum.Levels.rightOnly.getLine();
		levels[4] = LevelEnum.Levels.rightOnly.getLine();
		levels[5] = LevelEnum.Levels.rightOnly.getLine();
		levels[6] = LevelEnum.Levels.plusRight.getLine();
		return levels;
	}
	
	public static String[] getEight(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.full.getLine();
		levels[1] = LevelEnum.Levels.leftRight.getLine();
		levels[2] = LevelEnum.Levels.leftRight.getLine();
		levels[3] = LevelEnum.Levels.full.getLine();
		levels[4] = LevelEnum.Levels.leftRight.getLine();
		levels[5] = LevelEnum.Levels.leftRight.getLine();
		levels[6] = LevelEnum.Levels.full.getLine();
		return levels;
	}
	
	public static String[] getNine(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.full.getLine();
		levels[1] = LevelEnum.Levels.leftRight.getLine();
		levels[2] = LevelEnum.Levels.leftRight.getLine();
		levels[3] = LevelEnum.Levels.full.getLine();
		levels[4] = LevelEnum.Levels.rightOnly.getLine();
		levels[5] = LevelEnum.Levels.rightOnly.getLine();
		levels[6] = LevelEnum.Levels.full.getLine();
		return levels;
	}
	
	public static String[] getColumn(){
		levels = new String[NUMBER_OF_LEVELS];
		levels[0] = LevelEnum.Levels.empty.getLine();
		levels[1] = LevelEnum.Levels.empty.getLine();
		levels[2] = LevelEnum.Levels.plusMiddle.getLine();
		levels[3] = LevelEnum.Levels.empty.getLine();
		levels[4] = LevelEnum.Levels.plusMiddle.getLine();
		levels[5] = LevelEnum.Levels.empty.getLine();
		levels[6] = LevelEnum.Levels.empty.getLine();
		return levels;
	}
	
}
