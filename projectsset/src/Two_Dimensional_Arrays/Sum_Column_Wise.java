package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Sum_Column_Wise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and Column size");
		int row = sc.nextInt(),col=sc.nextInt(),sum;
		System.out.println("Enter the Value for 2D Array");
		int [][]arr=new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();		
			}
		}
		for (int i = 0; i < arr.length; i++) {
			sum=0;
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[j][i];
			}
			System.out.println((i+1)+" column's sum is -->"+sum);
		}
		
	}
}
