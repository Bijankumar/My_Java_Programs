package com.technoelivate.Assignment;
	// Armstrong number (153)
public class ArmStrong_Number {
	public static void main(String[] args) {
		int no =153,copy=no,sum=0;
		String str =""+no;
		int exp= str.length();
		while(no!=0) {
			int base = no%10;
			sum+=power(base,exp);
			no/=10;
		}
		if(copy==sum)
			System.out.println(copy+" is an Armstrong Number !!");
		else
			System.out.println(copy+" is not an Armstrong Number");
	}

	private static int power(int base, int exp) {
		int ans=1;
		while(exp!=0) {
			ans*=base;
			exp--;
		}
		return ans;
	}
}
