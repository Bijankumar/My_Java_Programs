package com.technoelevate.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Test {
	public static void main(String[] args) {
		Map map = new TreeMap(); // Default Sorted order ascending..
		map.put(101,"Bijan");
		map.put(105, "Raj");
		map.put(102,"Chakra");
		map.put(104,"Ram");
		
		System.out.println(map);
		
		// Customized Comparing keys for sorting Descending..
		TreeMap map2 = new TreeMap(new MyComparator());
		map2.put(101,"Bijan");
		map2.put(105, "Raj");
		map2.put(102,"Chakra");
		map2.put(104,"Ram");
		
		System.out.println(map2);

	}
}
class MyComparator implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		
//		return i1.compareTo(i2);	 //Ascending Order..
		return i2.compareTo(i1);	// Descending order..	
	}
	
}
