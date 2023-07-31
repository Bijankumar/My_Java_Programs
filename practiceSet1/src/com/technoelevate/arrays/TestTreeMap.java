package com.technoelevate.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		TreeMap tr = new TreeMap();
		tr.put(1, 5);
		tr.put(2, 7);
		tr.put(3, 8);
		tr.put(4, 9);
		HashMap hg = new HashMap();
		hg.putAll(tr);
		System.out.println(hg);
		System.out.println(tr.firstKey());
		System.out.println(tr.lastKey());
		
	}
}
