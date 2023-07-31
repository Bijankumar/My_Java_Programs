package com.technoelivate.javabasics;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
//		int max=100,min=1,x;
//		x=(int) (Math.random()*(max-min+1)+min);
//		System.out.println(x);
		
		Random random = new Random();
		System.out.println(random.nextInt(100));
	}
}
