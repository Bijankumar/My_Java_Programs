package com.technoelivate.Inheritance;

class Dem{
	static int a =20,b = 10;
}
class Memo extends Dem {
	static int rem =a%b, div = a/b;
}
public class Multi_Level_Inheritance extends Memo {
	public static void main(String[] args) {
	System.out.println(" Sum : "+(a+b)+"\n Substraction : "+(a-b));
	System.out.println(" Division : "+div+"\n Reminder : "+rem);

	}
}
