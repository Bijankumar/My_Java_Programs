package Patterns;

public class Dimondd {
	public static void main(String[] args) {
//		for (int i = 1; i <=5; i++) {
//			for (int j = 5; j >=1; j--) {
//				if(i>=j)
//					System.out.print("* ");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if(i<j)
//					System.out.print("* ");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		int n=7;
		int star =1;
		int space=n/2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<n/2+1){
				space--;
				star+=2;
			}else{ 		
				space++;
				star-=2;
			}
		}
		
	}
}
