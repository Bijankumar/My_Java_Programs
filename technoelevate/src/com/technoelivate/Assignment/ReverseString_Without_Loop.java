package com.technoelivate.Assignment;
//	Reverse String without loop
//	i/p: “deepti” 
//	o/p: itpeed

public class ReverseString_Without_Loop {
	static String str = "deepti",rev="";
	static int n =str.length()-1;
	public static void main(String[] args) {
		System.out.println(str);
		System.out.println(reverse(str));
//		reverse(str);
	}

//	private static void reverse(String str) {
//		if(n!=0) {
//			rev+=str.charAt(n);
//			n--;
//			reverse(str);
//		}else if(n==0) {
//			rev+=str.charAt(n);
//			System.out.println(rev);
//		}
	
	private static String reverse(String str) {
		if(str.isEmpty())
			return str;
		else
			return reverse(str.substring(1))+str.charAt(0);
			
	}
}
