package com.technoelevate.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
// Default capacity 16.. & load factor 0.75.(We can change)

public class IdentityHasMap {
	public static void main(String[] args) {
		Map map = new HashMap(); // JVM uses .equlas() to identify duplicate keys meant for content compare.
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		map.put(i1, "Bijan");
		map.put(i2, "Chakra");
		System.out.println(map);
		
		
		Map map1= new IdentityHashMap();// JVM uses (==) to identify duplicate keys meant for address compare.
		Integer j1 = new Integer(10);
		Integer j2 = new Integer(10);
		map1.put(j1, "Bijan");
		map1.put(j2, "Chakra");
		System.out.println(map1);
	}
}
