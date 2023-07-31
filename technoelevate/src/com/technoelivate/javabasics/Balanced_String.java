package com.technoelivate.javabasics;

import java.util.Stack;

public class Balanced_String {
	public static void main(String[] args) {
		String str = "{[()]}";
		Stack<Character> stack = new Stack();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch=='{'||ch=='['||ch=='(') stack.push(ch);
			else if ((stack.isEmpty()==false)&&((ch==')'&&stack.pop()=='(')||(ch==']'&&stack.pop()=='[')||(ch=='}'&&stack.pop()=='{'))) stack.pop();
		}
		if(stack.isEmpty())
			System.out.println("Balanced String");
		else
			System.out.println("Not Blanced !!");
	}
}
