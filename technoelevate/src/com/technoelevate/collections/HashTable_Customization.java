package com.technoelevate.collections;

import java.util.Hashtable;

public class HashTable_Customization {
	public static void main(String[] args) {
		Hashtable h = new Hashtable(20);	// initialized default capacity..
		h.put(new Tempo(5),	"Ab");
		h.put(new Tempo(2),	"zz");
		h.put(new Tempo(1),	"pp");
		h.put(new Tempo(4),	"aa");
		h.put(new Tempo(11),"jj");
		h.put(new Tempo(15),"tt");
		
		System.out.println(h);	// o/p = {15=tt, 11=jj, 5=Ab, 4=aa, 2=zz, 1=pp}

	}
}
class Tempo{
	int i ;
	public Tempo(int i) {
		this.i = i;
	}
	@Override
	public int hashCode() {
		return i;
	}
	@Override
	public String toString() {
		return i+"";
	}
}
