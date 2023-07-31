package com.technoelevate.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Synchronized_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		Map map2	=	Collections.synchronizedMap(map);
		map2.put(101,"Bijan");
		map2.put(102,"Chakra");
		map2.put(104,"Ram");
		map2.put(105, "Raj");
		map2.put(103, "Mam");
		
		System.out.println(map2);
	}
}
