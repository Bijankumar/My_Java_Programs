package com.technoelevate.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTester {
	public static void main(String[] args) {
		Map map = new HashMap();	// Default capacity 16.. & load factor 0.75.(We can change)
		map.put(101	,"Bijan");		// uses .equals() method for compare keys.
		map.put(102, "Chakra");		
		map.put(104	,"Ram");
		map.put(105, "Raj");
		map.put(103, "Mam");
		
		System.out.println(map); // {K=V,K=V,...}
		System.out.println(map.get(102));	// returns value of specified Key.
		System.out.println(map.containsKey(102));	// returns specified Key present or not.
		System.out.println(map.containsValue("Mam"));	// returns specified Value present or not.
		System.out.println(map.isEmpty());	// returns the map is empty or not.
		
		Set set = map.entrySet();
		System.out.println(set);	// Collection view of map.
		
		Collection values = map.values();
		System.out.println(values); // Collection view of list of Values.
		
		Set set2 = map.keySet();
		System.out.println(set2); // Collection View of list of keys.
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			Map.Entry me = (Entry) it.next();
			System.out.println(me.getKey()+" : : "+me.getValue());
			if(me.getKey().equals(103)){
				me.setValue("Bijan Kumar");
			}
		}
		System.out.println(map);
	}
}
