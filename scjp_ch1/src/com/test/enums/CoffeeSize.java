package com.test.enums;

public enum CoffeeSize {
	SMALL(1), 
	MEDIUM(2), 
	LARGE(3, 8){
		public String getDescription() {
			return "getDescription() LARGE";
		}
	};
	
	private int ounces;
	private int height;

	public int getOunces() {
		return ounces;
	}
	
	int getHeight() {
		return height;
	}

	private CoffeeSize(int ounces) {
		this.ounces = ounces;
	}
	private CoffeeSize(int ounces, int height) {
		this.ounces = ounces;
		this.height = height;
	}
	public String getDescription() {
		return "getDescription()";
	}
	
}
