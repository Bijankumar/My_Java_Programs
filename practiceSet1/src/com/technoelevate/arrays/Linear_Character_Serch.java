package com.technoelevate.arrays;

public class Linear_Character_Serch {
	public static void main(String[] args) {
		int [] arr = {5,2,8,9,4,6,3,1,7};
		int linear = 10,count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==linear) {
				count++;
				System.out.println("yes it is here !! \n at the position of :"+i);
			}	
		}
		if(count==0)System.out.println("Sorry!! Match Not Found!!");
	}
}
