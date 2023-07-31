package MyPackage;

import java.util.Arrays;

public class NumArray {
	public static void main(String[] args) {
		int n= 12256;
		String str = ""+n;	//Number to String Conversion
		
		int x = Integer.parseInt(str);
		System.out.println(x);	// String to Number Conversion
		
		char []ch = str.toCharArray();	
		System.out.println(Arrays.toString(ch));	//String To Char Array
		
		int []ar=new int[ch.length]; 
		for (int i = 0; i < ch.length; i++) {
			ar[i]=ch[i]-48;
		}
		System.out.println(Arrays.toString(ar));// Char to Integer Array
		
		int []ar2=new int[ch.length]; 
		for (int i = 0; i < str.length(); i++) {
			ar2[i]=str.charAt(i)-48;
		}
		System.out.println(Arrays.toString(ar2));// String to Integer Array
		
		String str1 = "Meena";
		String str2=str1.replace('e','d');
		System.out.println(str2);	// Character replace 
		
		String str3=str1.replace("e","dolar");
		System.out.println(str3); //String replace using replace Method
		
//		String str4 = str1.replaceAll('d','M');	//not possible character replace in replaceAll
		
		String str4 = str1.replaceAll("D","M");
		System.out.println(str4);	//String replace using replaceAll Method
		
		boolean flag = false;
		System.out.println(str1+n+flag);
		
	}
}
