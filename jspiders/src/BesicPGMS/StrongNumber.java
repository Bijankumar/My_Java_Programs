package BesicPGMS;

public class StrongNumber {
public static void main(String[] args) {
	int no = 145;
	int copy = no;
	int sum = 0;
	while (no!=0) {
		int fact = 1;
		int rem=no%10;
		for (int i=rem;i>0; i--) {
			fact*=i;
		}
		sum+=fact;
		no/=10;
	}
	System.out.println(sum);
	if (sum==copy) {
		System.out.println("it's a Strong Number");
	}else{
		System.out.println("it's not a Strong Number");
	}
}
}
