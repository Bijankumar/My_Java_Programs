
public class StrongNumber {
	public static void main(String[] args) {
		int no =146,copy=no,sum=0;
		while(no!=0)
		{
			int rem=no%10,fact=1;
			for (int i = rem; i > 0; i--) {
				fact*=i;
			}
			sum+=fact;
			no/=10;
		}
		if(sum==copy)
			System.out.println("It's a Strong Number!!");
		else
			System.out.println("It's not a Strong Number !!");
	}
}
