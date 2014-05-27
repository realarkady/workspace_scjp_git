package com.test.whizlabs.exam1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q_16_AccessOrderTest {
	public static void main(String[] args) {
		Map<String, String> mapInsertionOrder = new LinkedHashMap<String, String>();
		Map<String, String> mapAccessOrder = new LinkedHashMap<String, String>(16, 4, true);
		mapInsertionOrder.put("key1", "value1");
		mapInsertionOrder.put("key2", "value2");
		mapInsertionOrder.put("key3", "value3");
		System.out.println(mapInsertionOrder);
		
		mapAccessOrder.put("key1", "value1");
		mapAccessOrder.put("key2", "value2");
		mapAccessOrder.put("key3", "value3");
		mapAccessOrder.put("key4", "value4");
		
		//before access
		System.out.println(mapAccessOrder);
		
		//access:
		System.out.println(mapAccessOrder.get("key3"));
		System.out.println(mapAccessOrder.get("key2"));
		
		//after access
		System.out.println(mapAccessOrder);
	}
}
