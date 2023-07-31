package com.technoelevate.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Method_LinkedList {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(101);
		list.add(102);
		list.add(103);

		List<Integer> list2 = new LinkedList<Integer>();
		list2.add(201);
		list2.add(202); // 1. Normal Adding elements
		list2.add(203);

		List<Integer> list3 = new LinkedList<Integer>();
		list3.add(150);
		list3.add(250);
		list3.add(101);
		list3.add(102);
		
		List<Integer> list5 = new ArrayList<Integer>(5);
		System.out.println(list5.size());
		int x = Collections.max(list);
		System.out.println(x);
		
	}
}
