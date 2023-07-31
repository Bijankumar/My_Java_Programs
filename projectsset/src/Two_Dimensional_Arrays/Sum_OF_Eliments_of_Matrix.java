package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Sum_OF_Eliments_of_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and Column size");
		int row = sc.nextInt(),col=sc.nextInt();
		System.out.println("Enter the Value for 2D Array");
		int [][]arr=new int[row][col];
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();		
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
