package com.technoelevate.lamdaexpression;

public class MyWorkShop {
	public static void main(String[] args) {
		// Creating Implementation class Object
		ImplementClass class1 = new ImplementClass();
		class1.sum(8, 7);
		
		// No need of Implementation class create anonymous class
		MyInterface my = new MyInterface() {
			@Override
			public void sum(int a, int b) {
				System.out.println("By Anonymous class: Sum is :"+(a+b));
			}
		};
		my.sum(7, 5);
		
		//no need Extra class and overridden method
		MyInterface interface1 = (a,b)->{
			System.out.println("By Lamda Expression: Sum is :"+(a+b));
		};
		interface1.sum(5, 5);
		
		// In case of single statement no need {} braces/blocks also.
		MyInterface interface2 = (a, b) -> System.out.println("Optimized Code : Sum is :"+(a+b));
		interface2.sum(12, 8);
	}
}
