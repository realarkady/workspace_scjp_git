package com.tasks.examlab.diagnostic;

import java.util.ArrayList;
import java.util.List;

public class Q_39_string_split_array {
	public static void main(String args[]) {
		List<Object[]> d = new ArrayList<Object[]>();
		// d.add({"A"}); // compiler ERROR! -->> invalid array init
		// d.add(new Object[]); // compiler ERROR! -->> no array size def
		d.add(new Object[1]);
		d.add(new Object[] { "A" });
		// d.add(new Object[1]{"A"});// compiler ERROR! -->> array size def conflicts with array init
		String[] s = "A".split("B");
		d.add("A".split("B"));
	}
}