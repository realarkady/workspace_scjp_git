package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class CollectionsTest {

	public CollectionsTest() {	}

	public static void main(String[] args) {
		List<ComparablePerson> pList = new ArrayList<>();
		pList.add(new ComparablePerson("John", 25));
		pList.add(new ComparablePerson("Nick", 21));
		pList.add(new ComparablePerson("John", 30));
		pList.add(new ComparablePerson("Andrew", 20));
		System.out.println("cPerson: " + pList);
		
		Collections.reverse(pList);
		System.out.println("cPerson: " + pList);
		
		Collections.sort(pList);
		System.out.println("cPerson: " + pList);
		
		Collections.reverse(pList);
		System.out.println("cPerson: " + pList);
		
		Comparator<ComparablePerson> comparatorReverseOrder = Collections.reverseOrder();
		Collections.sort(pList, comparatorReverseOrder);
		System.out.println("cPerson: " + pList);
		
		TreeSet<ComparablePerson> pTreeSet = new TreeSet<>(comparatorReverseOrder);
		pTreeSet.add(new ComparablePerson("John", 25));
		pTreeSet.add(new ComparablePerson("Nick", 21));
		pTreeSet.add(new ComparablePerson("John", 30));
		pTreeSet.add(new ComparablePerson("Andrew", 20));
		
		System.out.println("pTreeSet: " + pTreeSet);
		
	}

}
