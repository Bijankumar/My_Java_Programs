package Arrays;

public class Count_PerfectNo {
	public static void main(String[] args) {
		int arr[]= {7,6,18,28};
		System.out.println("The number of Perfectno is "+perfectno(arr));
	}
	public static int perfectno(int [] arr) {
		int count = 0,sum;
		for (int i = 0; i < arr.length; i++) {
			sum=0;
			for (int j = 1; j <= arr[i]/2; j++) {
				if(arr[i]%j==0)
					sum+=j;
			}
			if(sum==arr[i])
				count++;
		}
		return count;
	}
}