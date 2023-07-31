package com.technoelevate.collections;

import java.util.Hashtable;

// How hash code based object stores...

public class HashTable_Test {
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(new Temp(5),	"Ab");
		h.put(new Temp(2),	"zz");
		h.put(new Temp(1),	"pp");
		h.put(new Temp(4),	"aa");
		h.put(new Temp(11),	"jj");
		h.put(new Temp(15),	"tt");
		
		System.out.println(h);	//{5=Ab, 15=tt, 4=aa, 2=zz, 1=pp, 11=jj}
	}
}
class Temp{
	int i ;
	public Temp(int i) {
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