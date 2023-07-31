package com.technoelivate.javabasics;

public class Lcm_Hcf_FromGivenNumber {
	public static void main(String[] args) {
		int no1=7,no2=81;
		int max =(no1>no2)?no1:no2,lcm=max;
		while(true) {
			if(lcm%no1==0&&lcm%no2==0) { break;}
			else
			lcm+=max;
		}
		int hcf = (no1*no2)/lcm;
		System.out.println(lcm +" "+hcf);
	}
}
