package com.technoelevate.collections30;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.function.Consumer;

public class Travese_ForEach_Method {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(80);
		list.add(40);
		
		
		Consumer<Integer> com = new Consumer<Integer>() {
	
			@Override
			public void accept(Integer t) {
				System.out.print(t+" ");
			}
		};
		list.forEach(com);
		
		
		list.forEach(o->System.out.print(o+" "));
		
	}
}
