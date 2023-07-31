package Two_Dimensional_Arrays;

public class Jogged_Array {
	public static void main(String[] args) {
		int [] arr = {1,2,3},brr= {4,5,6,7},crr= {4,8,9,6,7,3},drr= {7,8,9};
		int [][] ans = {arr,brr,crr,drr};
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
}
