package com.technoelivate.javabasics;

public class Construt {
	int a;

	Construt(int a) {
		this.a = a;
	}
	public static int add(int...is) {
		int sum =0;
		for (int i : is) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Construt construt = new Construt(50);
		System.out.println(add(1,5,8,9,4,3));
	}
}
