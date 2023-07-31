package com.technoelevate.collections;

//Java program to show synchronization of ArrayList
import java.io.*;
import java.util.*;

class Synchronized_Arraylist {
	public static void main(String[] args)
	{
		// Non Synchronized ArrayList
		List<String> list = new ArrayList<String>();

		list.add("Eat");
		list.add("Coffee");
		list.add("Code");
		list.add("Sleep");
		list.add("Repeat");


		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.print(ite.next()+" ");
		}
		
		
		// Synchronizing ArrayList in Java
		list = Collections.synchronizedList(list);
		System.out.println();
		
		
		// we must use synchronize block to avoid
		// non-deterministic behavior
		synchronized (list)
		{
			Iterator<String> it = list.iterator();
			while (it.hasNext()) {
				System.out.print(it.next()+" ");
			}
		}
	}
}