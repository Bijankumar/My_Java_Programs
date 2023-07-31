package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Return_Square_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and Column size");
		int row = sc.nextInt(),col=sc.nextInt();
		System.out.println("Enter the Value for 2D Array");
		int [][]arr=new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();		
			}
		}
		int [][] ans=square(arr);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] square(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=arr[i][j]*arr[i][j];
			}
		}
		return arr;
	}
}
