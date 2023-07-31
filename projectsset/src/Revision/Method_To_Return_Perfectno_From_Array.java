package Revision;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Method_To_Return_Perfectno_From_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter The Size of Array");
		int size = sc.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the Value for Array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}	
		
		ArrayList l1 = new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			if(Perfect(arr[i]))
			l1.add(arr[i]);
		}
		System.out.println(l1);
	}

		private static boolean Perfect(int no) {
		int sum=0;
		for (int i = 1; i <= no/2; i++) {
			if(no%i==0) {
				sum=sum+i;
			}
		}
		if(no==sum)
			return true;
		else
			return false;
	}			
}
