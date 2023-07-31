
public class HappyNumber {
	public static void main(String[] args) {
		int no = 13,sum;
		while(no>9)
		{sum=0;
			do {
				int rem = no%10;
				sum+=rem*rem;
				no/=10;
			}while(no!=0);
			no=sum;
		}	
		if(no==1||no==7)
			System.out.println("It's a Happy Number !!");
		else
			System.out.println("It's not a Happy Number !!");
	}
}
