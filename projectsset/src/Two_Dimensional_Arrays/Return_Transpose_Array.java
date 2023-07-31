package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Return_Transpose_Array {
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
		int[][]ans=transpose(arr);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] transpose(int[][] arr) {
		int [][] res = new int [arr.length][arr[0].length];
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				res[i][j]=arr[j][i];
			}
		}
		return res;
	}
}
