package com.technoelivate.javabasics;

public class Variables {
    int x = 10; // instance variable
    void method() {
        System.out.println(x); // prints 10
    }
    public static void main(String[] args) {
		Variables variables = new Variables();
		variables.method();
	}
}
