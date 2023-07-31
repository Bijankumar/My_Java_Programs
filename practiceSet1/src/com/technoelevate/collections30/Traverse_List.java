package com.technoelevate.collections30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Traverse_List {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(5);
		list.add(20);
		list.add(5);
		list.add(20);
		list.add(25);
	
		ArrayList li = new ArrayList();
		for (Object ol : list) {
			if(!li.contains(ol)) li.add(ol);
		}
		System.out.println(li);

//.............	doubt.......	
//		ListIterator lis = list.listIterator();
//		while (lis.hasNext()) {
//			for (int i = 0; i < list.size(); i++) {
//				if(lis.next().equals(list.get(i)))
//					lis.remove();
//			}
//			System.out.println(lis.next());
//		}
		
		
		
		
		
	// Traversing forward direction
		for (Object l : list) {
			System.out.print(l+" ");
		}
		
		System.out.println();
	// Traversing BackWard direction
		for(int i = list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
	}
}
