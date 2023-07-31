package com.technoelevate.strings;

import java.util.Stack;

public class Balance_String {
	public static void main(String[] args) {
		String str ="{[()]}";
		Stack<Character> st = new Stack<Character>();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(ch=='{'||ch=='['||ch=='(')
					st.push(ch);
				else if((st.isEmpty()==false)&&((ch==')'&&st.pop()=='(')||(ch==']'&&st.pop()=='[')||(ch=='}'&&st.pop()=='{')))
					st.pop();
			}
			if(st.isEmpty())
				System.out.println("It's a Balanced String !!");
			else
				System.out.println("It's not a Balanced String !!");
	}
}
