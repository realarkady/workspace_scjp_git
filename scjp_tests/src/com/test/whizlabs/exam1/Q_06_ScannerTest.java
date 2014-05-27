package com.test.whizlabs.exam1;

import java.util.Scanner;
import java.util.regex.MatchResult;

public class Q_06_ScannerTest {
	public static void main(String[] args) {
		String input = "1 done 2 done all done";
		Scanner s = new Scanner(input);
		s.findInLine("(\\d+) done (\\d+) done (\\w+) done");
		MatchResult result = s.match();
		for (int i = 1; i <= result.groupCount(); i++)
			System.out.print(result.group(i) + " ");
		s.close();
	}
}