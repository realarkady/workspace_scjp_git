package com.designpatterns.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(getMaxOccurances("aacccddd", 2));
	}

	public static char[] getMaxOccurances(String source, int num) {
		if (source == null || source.length() == 0 || num < 1)
			return null;
		
		char[] charArray = new char[num];
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		//populate charMap with <char, numebrOfOccurances>
		for (int i = 0; i < source.length(); i++) {
			char c = source.charAt(i);
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		
		//sort charMap (descending order)
		sortMapByValueDescending(charMap);
		
		//get first (most occured) num characters
		Iterator<Character> iterator = charMap.keySet().iterator();
		for (int j = 0; iterator.hasNext() && j < num; j++) {
			charArray[j] = iterator.next();
		}
		
		return charArray;
	} // aacccdddd, 2 => [c, d]
	
	public static void sortMapByValueDescending(Map<Character, Integer> map) {
		Set<Entry<Character, Integer>> set = map.entrySet();
        List<Entry<Character, Integer>> list = new ArrayList<Entry<Character, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<Character, Integer>>()
        {
            public int compare( Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
	}

}
