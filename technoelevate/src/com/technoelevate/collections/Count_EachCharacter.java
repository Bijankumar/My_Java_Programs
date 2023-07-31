package com.technoelevate.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Count_EachCharacter {
	public static void main(String[] args) {
		String str = "BiajnKumar";
		char []ch = str.toLowerCase().toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i]))
				map.put(ch[i], map.get(ch[i])+1);
			else
				map.put(ch[i], 1);
		}
		
		 	Set<Entry<Character, Integer>> set = map.entrySet();
		 	
			Iterator<Entry<Character, Integer>> it = set.iterator();
		while(it.hasNext()) {
			Map.Entry<Character, Integer> me =  it.next();
			
			System.out.println(me.getKey()+"=>"+me.getValue());
		}
		
//		for (Map.Entry<Character, Integer> entry: map.entrySet()) {
//			System.out.println(entry.getKey()+"-->"+entry.getValue());
//		}
	}
}
