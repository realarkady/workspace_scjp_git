package com.test.enums;

public class Coffee {

	public Coffee() {
		
	}

	public static void main(String[] args) {
		CoffeeSize cSizeSmall = CoffeeSize.SMALL;
		CoffeeSize cSizeLarge = CoffeeSize.LARGE;
		System.out.println(cSizeSmall.getOunces());
		System.out.println(cSizeLarge.getDescription());
		for (CoffeeSize cs : CoffeeSize.values()) {
			System.out.println("cs: " + cs + "\tounces: " + cs.getOunces() + "\theight: " + cs.getHeight() + "\tDescription: " + cs.getDescription());
		}
	}

}
