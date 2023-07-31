package com.technoelevate.collections;

import java.util.HashMap;

class Tem{
	
	public String toString() {
		return "tem";
	}
	public void finalize() {
		System.out.print("Garbage Collector Called");
	}
}
public class WeakHashMap {
	public static void main(String[] args) throws InterruptedException {
		Tem t = new Tem();
		HashMap h = new HashMap();
		h.put(t, "Bijan");
		System.out.println(h);
		t = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(h);
		
		java.util.WeakHashMap h1 = new java.util.WeakHashMap();
		h1.put(t, "Bijan");
		System.out.println(h);
		t = null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(h);
	}
}
