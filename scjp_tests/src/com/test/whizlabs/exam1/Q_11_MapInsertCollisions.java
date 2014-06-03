package com.test.whizlabs.exam1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q_11_MapInsertCollisions {
	public static void main(String[] args) {
		Map<String, String> fruit = new LinkedHashMap<String, String>();
		fruit.put("Apple", "red");
		fruit.put("Mango", "yellow");
		fruit.put("Guava", "green");
		fruit.put("Cherry", "red");
		fruit.put("Mango", "red");
		for (String key : fruit.keySet()) {
			System.out.println(key + ": " + fruit.get(key));
		}
	}
}