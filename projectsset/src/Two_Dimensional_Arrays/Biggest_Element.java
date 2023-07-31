package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Biggest_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and Column size");
		int row = sc.nextInt(),col=sc.nextInt(),big;
		System.out.println("Enter the Value for 2D Array");
		int [][]arr=new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();		
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
		 big = arr[i][0];
			for (int j = 0; j < arr.length; j++) {
				if(big<arr[i][j])
					big=arr[i][j];
			}
			System.out.println(big);
		}
		
	}
}
