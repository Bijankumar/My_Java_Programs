package com.technoelivate.javabasics;

public class Test_Case {
	public static void main(String[] args) {
		int i = 0;
		int j = i++ + ++i + --i + i++;
			//  0 +     2 +   1 + 1 ==>4
		System.out.println(j); // 4
		System.out.println(i); // 2
		
		int a=10;
		int b=a++; //10
		int c=++a; //12
		a=a++ + ++b + c++;
	//	  12  +  11 + 12 ==>35
		b=b++ + ++c + a++;
	//    11  +  14 + 35  ==>60
		c=c++ + ++a + b++; 
	//    14  +  37 + 60   ==> 109
		System.out.println(c); //  13  14  15  111
		System.out.println(b); //  11  12  60  61
		System.out.println(a); //  13  35  36  37
		
		int ii=10; 
		if(ii++>10 || ii++>10){
			System.out.println(ii++); //12
		} 
		System.out.println(ii);//13
		
		int aa=0; 
		int bb=aa++<=0?0:1;
	//          0
		System.out.println(bb); // 0
		System.out.println(aa); // 1
	}
}
