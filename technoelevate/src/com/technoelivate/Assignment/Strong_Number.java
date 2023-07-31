package com.technoelivate.Assignment;
// Strong number (145)
public class Strong_Number {
	public static void main(String[] args) {
		int no =145,sum=0,copy = no;
		while(no!=0) {
			int rem = no%10,fact=1;
			for (int i = rem; i > 0; i--) {
				fact*=i;
			}
			sum+=fact;
			no/=10;
		}
		if(sum==copy)
			System.out.println(copy+" is a Strong Number !!");
		else
			System.out.println(copy+" is not a Strong Number !!");
	}
}
