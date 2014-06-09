package com.test.enums;

public class Sprite {
	public static void main(String[] args) {
		Nav.Direction d = Nav.Direction.NORTH;
		System.out.println(d);
	}
}

class Nav {
	public static enum Direction {
		NORTH, SOUTH, EAST, WEST
	}
	
	public static void main(String[] args) {
		Direction d = Direction.SOUTH;
		System.out.println(d);
		switch (d) {
		case SOUTH:	System.out.println(d);
		default: System.out.println("default");
		case NORTH:	System.out.println(Direction.NORTH);
		}
	}
}
