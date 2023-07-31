package com.technoelevate.strings;

public class Swaping_Without_ThirdVariable {
	public static void main(String[] args) {
		String str1="Chakra",str2="Pani";
		System.out.println("Before Swaping :"+str1+" "+str2);
		str2=str1+str2;
		str1=str2.replaceAll(str1,"");
		str2=str2.replaceAll(str1,"");
		System.out.println("After Swaping :"+str1+" "+str2);
	}
}
