package com.test.enums;

public class Sprite {
	public static void main(String[] args) {
		Nav.Direction d = Nav.Direction.NORTH;
	}
}

class Nav {
	public enum Direction {
		NORTH, SOUTH, EAST, WEST
	}
	
	public static void main(String[] args) {
		Direction d = Direction.NORTH;
	}
}
