package com.technoelivate.javabasics;

public class NumberToWord {
	static int no =110,count=0,count2,rem,rem2,x=2;
	 public static void main(String[] args) {
		
		String [] ones= {"","one","two","three","Four","Five","six","seven","eight","nine","","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Nineteen"},
				  tens= {"","Ten","Twenty","Thirty","Forty","fifty","Sixty","Seventy","Eighty","Ninty"},
				  hundreds= {"","One hundred and","Two hundred and","Three hundred and","Four hundred and","Five hundred and","Six hundred and","Seven hundred and","Eight hundred and","Nine hundred and"},
				  res = new String[3];
		String ress="";
		while(no!=0) {
			rem = no%10;
			rem2= no%100;
			count++;
			no/=10;
			if(count==1) 
				if(rem2>10&&rem2<20){
					count2++;
					ress+=""+ones[rem2];
					}
				else {ress+=""+ones[rem];}
			
			else if(count==2&&count2==0) 
				ress+=""+tens[rem];
			else
				ress+=""+hundreds[rem];
			}
		System.out.println(ress);
	 }
}
