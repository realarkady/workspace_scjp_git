package com.tasks.examlab.exam1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q_14_Collectiona_sort {
	public static void main(String args[]) {
		List<String> hydrocarbon = new ArrayList();
		hydrocarbon.add("CH4");
		hydrocarbon.add("C2H6");
		hydrocarbon.add("C2H4");
		hydrocarbon.add("COOH");
		Collections.sort(hydrocarbon);
		for (Object ob : hydrocarbon)
			System.out.print(ob + ",");
	}
}