package com.technoelevate.collections30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collections_Test {
	public static void main(String[] args) {
		 List list = new ArrayList();
			list.add(50);
			list.add(10);
			list.add(20);
			list.add(60);
			list.add(30);
			list.add(40);
		
		Collections.synchronizedList(list);//Not
			
	LinkedList<Integer> ll = new LinkedList();
		ll.addAll(list);
		System.out.println(ll);
	
		
	HashSet<Object>  hs = new HashSet();
	System.out.println(hs.isEmpty());
			
			
		System.out.println(list.isEmpty());
		
		System.out.println(list.indexOf(60));
		
		Object [] arr =list.toArray();
		System.out.println(Arrays.toString(arr));

		
		ListIterator<Object> it = list.listIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		list.removeAll(list);
		System.out.println("\n"+list);
		
		List<Integer> liss = Arrays.asList(12,313,32,2,1,33);
//		liss.add(5);	// we can't modify
		System.out.println(liss);
		
		Iterator<Integer> ite = liss.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+" ");
//			liss.remove(2); 	// we can't modify
		}
		
	}
}
