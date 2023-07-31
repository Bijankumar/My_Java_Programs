package com.technoelevate.basics;

public class Operators {
	public static void main(String[] args) {
		// Unary Operator 	:i++,++i,i--,--i,~i;
		int a=10,b=10,c=10,d=10,e=10,f=10,g=-10;
		a++;	// use then increment by +1;
		b--;	// use then decrement by -1;
		++c;	// increment by +1 then use;
		--d;	// decrement by -1 then use;
		f=~f;	// converts +ve to it's opposite by incrementing 1; 
		g=~g;	// converts -ve to it's opposite by decrementing 1; 
		
		System.out.println(a+" "+b+" "+c+" "+d+" "+f+" "+g);
		
		// Ternary Operator	: <<,>>,>>>
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
		
		System.out.println(-20>>>2);
	}
}
